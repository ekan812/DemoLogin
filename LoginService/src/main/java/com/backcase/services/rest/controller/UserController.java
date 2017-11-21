package com.backcase.services.rest.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backcase.services.rest.domain.User;
import com.backcase.services.rest.service.UserServiceInt;

@Controller
public class UserController {

	@Autowired
	UserServiceInt userService;
	
	@RequestMapping("/user/{id}")
	public ResponseEntity<User> findUser(@PathVariable("id") int id){
		return new ResponseEntity<User>(userService.getUser(id), HttpStatus.OK);
	}
	
	@RequestMapping("/user")
	public ResponseEntity<List<User>> findUsers(){
		return new ResponseEntity<List<User>>(userService.getUsers(),HttpStatus.OK);
	}
}
