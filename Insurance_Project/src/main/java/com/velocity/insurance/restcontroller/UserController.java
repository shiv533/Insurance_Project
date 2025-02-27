package com.velocity.insurance.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.entity.Nominee;
import com.velocity.insurance.entity.User;
import com.velocity.insurance.service.NomineeService;
import com.velocity.insurance.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	public UserService userService;

	@Autowired
	public NomineeService nomineeService;

	// Design Service to add user with multiple nominee details into system

	@PostMapping("/saveUserNominee")
	ResponseEntity<User> saveUserNominee(@RequestBody User user) {
		User savedUser = userService.saveUser(user);
		List<Nominee> nominies = user.getNominees();
		for (Nominee nominee : nominies) {
			nominee.setUserId(user.getUserId());
			nomineeService.saveNominee(nominee);
		}
		return ResponseEntity.ok().body(savedUser);
	}

	// @Author Satish

	// Design Service to get user with multiple nominee details from system

	@GetMapping("/get/{id}")
	public User getUserById(@PathVariable("id") Integer id) {
		User getuser = userService.getUserById(id);
		return getuser;
	}

//	@PostMapping("/saveUserData")
//	public User saveUserData(@RequestBody User user) {
//	
//		User user1 = userService.saveUser(user);
//		return user1;
   @DeleteMapping("/deleteUserPolicyNominee/{Id}")
	public void deleteUserPolicy(@PathVariable("Id")Integer Id) {
		userService.deleteUser(Id);
		}
//		
//	}

}
