package com.seatBooking.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seatBooking.Model.Seat;
import com.seatBooking.Service.SeatService;


@RestController
@RequestMapping("/Seat")
public class SeatController {
   
	
	@Autowired
	SeatService service;
	
	
	@PostMapping("/add")
	public ResponseEntity<String> addSeat(@RequestBody Seat s) {
		Seat se = service.addSeat(s);
	
		
		return new ResponseEntity<String>("Record inserted successfully", HttpStatus.OK);
}
	
		
	
}
