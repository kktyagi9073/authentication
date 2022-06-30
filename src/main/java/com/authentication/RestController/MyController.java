package com.authentication.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.Entity.NewUser;
import com.authentication.Service.MainService;

@RestController
public class MyController {

	@Autowired
	MainService mainService;

	@PostMapping("/registration")
	public NewUser Apply(@RequestBody NewUser reg) {
		return mainService.saveRegistration(reg);

	}

	@PostMapping("/login")
	public List<NewUser> logins(@RequestParam String username, String password) {
		return mainService.getUsers(username,password);
		
	}
@GetMapping("/users")
public List<NewUser> GetAllUsers(){
	return mainService.FindAllUsers();

		 
	}

}
