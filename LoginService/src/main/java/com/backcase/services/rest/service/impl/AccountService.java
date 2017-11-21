package com.backcase.services.rest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.backcase.services.rest.domain.Account;
import com.backcase.services.rest.domain.User;
import com.backcase.services.rest.repository.AccountRepositoryInt;
import com.backcase.services.rest.repository.UserRepositoryInt;
import com.backcase.services.rest.service.AccountServiceInt;

@Service
public class AccountService implements AccountServiceInt {

	@Autowired
	AccountRepositoryInt accountRepository;
	
	@Autowired
	UserRepositoryInt userRepository;

	@Override
	public ResponseEntity<List<Account>> getAccounts(long id) {
		// TODO Auto-generated method stub
		List<Account> accounts = new ArrayList<Account>();
		if (id >= 1) {
			try {
				accounts = userRepository.findOne(id).getAccounts();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error al buscar cuentas. " + e.getMessage());
			}
			if(accounts.isEmpty()) {
				return new ResponseEntity<List<Account>>(new ArrayList<Account>(), HttpStatus.NOT_FOUND);
			} else {
				return new ResponseEntity<List<Account>>(accounts, HttpStatus.OK);
			}
		} else {
			return new ResponseEntity<List<Account>>(new ArrayList<Account>(), HttpStatus.NOT_FOUND);
		}
	}

}
