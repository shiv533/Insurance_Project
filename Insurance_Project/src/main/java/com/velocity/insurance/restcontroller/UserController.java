package com.velocity.insurance.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.entity.AuditLog;
import com.velocity.insurance.entity.Claim;
import com.velocity.insurance.entity.Nominee;
import com.velocity.insurance.entity.User;
import com.velocity.insurance.repository.AuditLogRepository;
import com.velocity.insurance.service.ClaimService;
import com.velocity.insurance.service.NomineeService;
import com.velocity.insurance.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	public UserService userService;

	@Autowired
	public NomineeService nomineeService;
	

	@Autowired
	private ClaimService claimService;
	
	@Autowired
	private AuditLogRepository auditLogrepository;

	// Design Service to add user with multiple nominee details into system

	@PostMapping("/saveUserNominee")
	ResponseEntity<User> saveUserNominee(@RequestBody User user) {
		User savedUser = userService.saveUser(user);
		List<Nominee> nominies = user.getNominees();
		for (Nominee nominee : nominies) {
			nominee.setUserId(user.getId());
			nomineeService.saveNominee(nominee);
		}
		return ResponseEntity.ok().body(savedUser);
	}

	@Transactional
	@PostMapping("/saveUserClaim")
	ResponseEntity<User>  addUser(@RequestBody User user) {
		User user2 = userService.saveUser(user);
		List<Claim> claims = user.getClaimList();
		for (Claim claim : claims) {
			claim.setInsuranceId(user.getId());
			claimService.saveClaim(claim);	
		}
		return ResponseEntity.ok().body(user2);
	}

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
   
//		
//	}
	@DeleteMapping("/deleteUserNominee/{id}")
	public void deleteUserPolicy(@PathVariable("id")Integer Id) {
		userService.deleteUser(Id);
		
		}
	
	// Create a rest controller for updating user data
	 @PutMapping("/updateUserNominee")
	    public ResponseEntity<User> updateUserNominee(@RequestBody User user) {
	        User updatedUser = userService.updateUser(user);
	        return ResponseEntity.ok(updatedUser);
	    }
	 
	 
		// @Author Satish
	// Get user by first name
	    @GetMapping("/fname/{firstName}")
	    public ResponseEntity<User> getUserByFirstName(@PathVariable String firstName) {
	        Optional<User> user = userService.getUserByFirstName(firstName);
	        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }

		// @Author Satish
	    // Get user by last name
	    @GetMapping("/lname/{lastName}")
	    public ResponseEntity<User> getUserByLastName(@PathVariable String lastName) {
	        Optional<User> user = userService.getUserByLastName(lastName);
	        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }

		// @Author Satish
	    // Get user by email ID
	    @GetMapping("/email/{emailId}")
	    public ResponseEntity<User> getUserByEmailId(@PathVariable String emailId) {
	        Optional<User> user = userService.getUserByEmailId(emailId);
	        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }
	    
	 // Login endpoint
//	    @PostMapping("/login")
//	    public ResponseEntity<String> loginUser(@RequestBody User loginRequest) {
//	        Optional<User> user = userService.getUserByUsername(loginRequest.getUsername());
//
//	        if (user.isPresent() && user.get().getPassword().equals(loginRequest.getPassword())) {
//	            return ResponseEntity.ok("Login successful");
//	        } else {
//	            return ResponseEntity.status(401).body("Invalid username or password");
//	        }
//	    }
	    
	    @PostMapping("/login")
	    public ResponseEntity<String> loginUser(@RequestBody User loginRequest) {
	        Optional<User> user = userService.getUserByUsername(loginRequest.getUsername());

	        if (user.isPresent() && user.get().getPassword().equals(loginRequest.getPassword())) {
	            // Successful login
	            auditLogrepository.save(new AuditLog(loginRequest.getUsername(), "SUCCESS"));
	            return ResponseEntity.ok("Login successful");
	        } else {
	            // Failed login
	            auditLogrepository.save(new AuditLog(loginRequest.getUsername(), "FAILED"));
	            return ResponseEntity.status(401).body("Invalid username or password");
	        }
	    }
}
