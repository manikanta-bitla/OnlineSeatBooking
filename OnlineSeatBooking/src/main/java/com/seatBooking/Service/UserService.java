package com.seatBooking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seatBooking.Model.User;
import com.seatBooking.Repository.UserRepo;


@Service
public class UserService {
	@Autowired
	UserRepo repo;
	
	
	public User addUser(User u) {
		
		return repo.save(u);

}
	
}
