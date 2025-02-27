package com.velocity.insurance.restcontroller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.entity.Nominee;
import com.velocity.insurance.entity.User;
import com.velocity.insurance.service.NomineeService;
import com.velocity.insurance.service.UserService;

@RestController
public class UserNomineeController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private NomineeService nomineeService;
	
	@PostMapping("/saveUserData")
	public ResponseEntity<User> saveUserData(@RequestBody User user) {
	
		User user1 = userService.saveUser(user);
		Set<Nominee> nominees =  user.getNomineeList();
		for (Nominee nominee : nominees) {
			nominee.setUserid(user.getId());
			nomineeService.getNomineeData(nominee);
				}
		return ResponseEntity.ok().body(user1);	
	}
	
	@DeleteMapping("/deleteUserPolicyNominee/{Id}")
	public void deleteUserPolicy(@PathVariable("Id")Integer Id) {
		userService.deleteUser(Id);
		}

}
