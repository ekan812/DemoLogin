package com.backcase.services.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.backcase.services.rest.domain.User;
import com.backcase.services.rest.service.LoginServiceInt;

@Controller
public class LoginController {
	
	@Autowired
	private LoginServiceInt loginService;

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ResponseEntity<User> singIn(@RequestBody User usr) {
		System.out.println("User:\n"+usr);
		return loginService.login(usr.getUser(), usr.getPassword());
	}
}
