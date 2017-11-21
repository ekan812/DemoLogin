package com.backcase.services.rest.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"accounts"})
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	private String user;
	private String password;
	private String name;
	private String lastname;
	private String email;
	@OneToMany(mappedBy = "owner")
	private List<Account> accounts;
	
	public User() {
		
	}

	public User(String user, String password, String name, String lastname, String email) {
		super();
		this.user = user;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", user=" + user + ", password=" + password + ", name=" + name + ", lastname="
				+ lastname + ", email=" + email + ", accounts=" + accounts + "]";
	}


	
}
