package com.authentication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authentication.AuthRepo.UserRepo;
import com.authentication.Entity.NewUser;


@Service
public class MainService {
	
	
	
	@Autowired
	UserRepo userRepo;
	
	public NewUser saveRegistration(NewUser reg) {
		// TODO Auto-generated method stub
		return userRepo.save(reg);
		
	}
	/*
	 * public void login(Login login) { // TODO Auto-generated method stub
	 * loginRepo.findAll(); }
	 */

	public List<NewUser> getUsers(String username, String password) {
		try {
		userRepo.findByUsernameAndPassword(username,password);
		}
		catch (IllegalArgumentException e) {
			e.printStackTrace();
			 
		}
		return userRepo.findAll();
		
		
	}

	public List<NewUser> FindAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
}
