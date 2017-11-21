package com.backcase.services.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.backcase.services.rest.domain.Account;
import com.backcase.services.rest.service.AccountServiceInt;

@Controller
public class AccountController {
	
	@Autowired
	AccountServiceInt accountService;

	@RequestMapping("/accounts")
	public ResponseEntity<List<Account>> findAccounts(@RequestParam("id") int id){
		return accountService.getAccounts(id);
	}
}
