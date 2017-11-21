package com.backcase.services.rest.service;

import java.util.List;

import com.backcase.services.rest.domain.User;

public interface UserServiceInt {

	public User getUser(long id);
	public List<User> getUsers();
}
