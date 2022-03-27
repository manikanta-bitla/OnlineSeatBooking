package com.seatBooking.Repository;





import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.seatBooking.Model.Booking;


@Repository

public interface BookingRepo extends CrudRepository<Booking, Integer> {

	
	
	
	

	
	
	
}
