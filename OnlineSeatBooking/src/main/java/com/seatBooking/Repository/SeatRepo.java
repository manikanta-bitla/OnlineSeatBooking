package com.seatBooking.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.seatBooking.Model.Seat;

@Repository
public interface SeatRepo extends CrudRepository<Seat, Integer> {
	
	
	


}
