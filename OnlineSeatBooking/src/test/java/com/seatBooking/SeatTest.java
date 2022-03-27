package com.seatBooking;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.seatBooking.Model.Seat;
import com.seatBooking.Repository.SeatRepo;
import com.seatBooking.Service.SeatService;



@SpringBootTest
public class SeatTest {

	@MockBean
	private SeatRepo repo;
	
	@Autowired
	private SeatService service;
	
	@Test
	public void saveSeat() {
		
		   Seat seat = new Seat(6, "CHENNAI" , 300 );
		
		   
			
			when(repo.save(seat)).thenReturn(seat);
			assertEquals(seat, service.addSeat(seat));
	    
	}
}
