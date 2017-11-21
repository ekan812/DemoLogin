package com.backcase.services.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.backcase.services.rest.domain.User;
import com.backcase.services.rest.repository.UserRepositoryInt;

@Service
public class LoginService implements com.backcase.services.rest.service.LoginServiceInt {

	@Autowired
	UserRepositoryInt repository;

	@Override
	public ResponseEntity<User> login(String user, String password) {
		// TODO Auto-generated method stub
		ResponseEntity<User> usr = null;
		User entity = new User();
		if (user != null && !user.equals("") && password != null && !password.equals("")) {
			try {
				entity = repository.findByUserAndPassword(user, password);
			} catch (Exception e) {
				usr = new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
				return usr;
			}
			if (entity == null) {
				usr = new ResponseEntity<User>(HttpStatus.NOT_FOUND);
				return usr;
			} else if (entity.getUser().equals("")) {
				usr = new ResponseEntity<User>(HttpStatus.NOT_FOUND);
				return usr;
			}
			usr = new ResponseEntity<User>(entity, HttpStatus.OK);
		} else {
			usr = new ResponseEntity<User>(HttpStatus.NOT_FOUND);
			return usr;
		}
		return usr;
	}

}
