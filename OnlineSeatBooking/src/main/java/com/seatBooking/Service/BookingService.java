package com.seatBooking.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.seatBooking.Model.Booking;
import com.seatBooking.Repository.BookingRepo;


@Component
@Service
public class BookingService {
   
	@Autowired
	BookingRepo repo;
	
	

public Booking addBooking(Booking b) {
		
		return repo.save(b);
	
	
}

	
}
