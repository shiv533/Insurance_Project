package com.velocity.insurance.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.entity.User;
import com.velocity.insurance.service.UserService;

@RestController
public class UserNomineeController {
	@Autowired
	private UserService userService;
	@PostMapping("/saveUserData")
	public User saveUserData(@RequestBody User user) {
	
		User user1 = userService.saveUser(user);
		return user1;

		
	}

}
