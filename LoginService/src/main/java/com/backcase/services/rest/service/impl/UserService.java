package com.backcase.services.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.backcase.services.rest.domain.User;
import com.backcase.services.rest.repository.UserRepositoryInt;
import com.backcase.services.rest.service.UserServiceInt;

@Service
public class UserService implements UserServiceInt {
	
	@Autowired
	UserRepositoryInt repository;

	@Override
	public User getUser(long id) {
		// TODO Auto-generated method stub
		System.out.println("Id: "+id);
		User usr= repository.findOne(id);
		System.out.println("User:\n"+usr);
		return usr;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
