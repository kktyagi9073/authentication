package com.authentication.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NewUser {
	
	@Id
	private String username;
	private String email;
	private String password;
	public NewUser() {
		}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public NewUser(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "NewUser [username=" + username + ", email=" + email + ", password=" + password + "]";
	}
	
}