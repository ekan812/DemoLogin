package com.backcase.services.rest.service;

import org.springframework.http.ResponseEntity;

import com.backcase.services.rest.domain.User;

public interface LoginServiceInt {
	public ResponseEntity<User> login(String user, String password);
}
