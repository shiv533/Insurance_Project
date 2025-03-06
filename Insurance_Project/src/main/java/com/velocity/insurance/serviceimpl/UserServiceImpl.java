package com.velocity.insurance.serviceimpl;
//	    //@Author Kaveri

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.entity.Nominee;
import com.velocity.insurance.entity.User;
import com.velocity.insurance.repository.NomineeRepository;
import com.velocity.insurance.repository.UserRepository;
import com.velocity.insurance.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
    private NomineeRepository nomineeRepository;
	
	@Override
	public User saveUser(User user) {

		User user1 = userRepository.save(user);
		return user1;

	}

	@Override
	public User getUserById(Integer id) {
		User find = userRepository.getById(id);
		return find;

	}
	public void deleteUser(Integer Id) {
		userRepository.deleteById(Id);

	}

	
	// Update user with multiple nominees
	 @Override
	    public User updateUser(User user) {
	        User existingUser = userRepository.findById(user.getUserId())
	                .orElseThrow(() -> new RuntimeException("User not found"));

	        // Update user details
	        existingUser.setFirstName(user.getFirstName());
	        existingUser.setLastName(user.getLastName());
	        existingUser.setEmailId(user.getEmailId());
	        existingUser.setMobileNo(user.getMobileNo());

	        // Update nominees: remove existing and add updated ones
	        nomineeRepository.deleteAllByUserId(existingUser.getUserId());
	        for (Nominee nominee : user.getNominees()) {
	            nominee.setUserId(existingUser.getUserId());
	            nomineeRepository.save(nominee);
	        }

	        return userRepository.save(existingUser);
	    }

	 @Override
	    public Optional<User> getUserByFirstName(String firstName) {
	        return userRepository.findByFirstName(firstName);
	    }

	    @Override
	    public Optional<User> getUserByLastName(String lastName) {
	        return userRepository.findByLastName(lastName);
	    }

	    @Override
	    public Optional<User> getUserByEmailId(String emailId) {
	        return userRepository.findByEmailId(emailId);
	    }
	
	}


