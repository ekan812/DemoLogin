package com.backcase.services.rest.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.backcase.services.rest.domain.Account;

public interface AccountServiceInt {

	public ResponseEntity<List<Account>> getAccounts(long id);
}
