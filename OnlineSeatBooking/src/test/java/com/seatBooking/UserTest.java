package com.seatBooking;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.seatBooking.Model.User;
import com.seatBooking.Repository.UserRepo;
import com.seatBooking.Service.UserService;


@SpringBootTest
public class UserTest {
	
	@MockBean
	private UserRepo repo;
	
	@Autowired
	private UserService service;
	
	
	  @Test public void saveUser() {
	  
	  User user = new User(38, "nani", "nn", "nani2gmail.com" );
	  
	  
	  
	  when(repo.save(user)).thenReturn(user);
	  assertEquals(user,service.addUser(user));
	  
	  }
	 

}
