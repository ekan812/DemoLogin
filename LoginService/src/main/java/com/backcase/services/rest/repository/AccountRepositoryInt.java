package com.backcase.services.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backcase.services.rest.domain.Account;

@Repository
public interface AccountRepositoryInt extends JpaRepository<Account, Long>{

	public List<Account> findByOwnerUserId(long userId);
}
