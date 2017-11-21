package com.backcase.services.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backcase.services.rest.domain.User;

@Repository
public interface UserRepositoryInt extends JpaRepository<User, Long> {

	public User findByUserAndPassword(String user, String password);
}
