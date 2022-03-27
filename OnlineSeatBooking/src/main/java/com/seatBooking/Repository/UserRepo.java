package com.seatBooking.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.seatBooking.Model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer>{

}
