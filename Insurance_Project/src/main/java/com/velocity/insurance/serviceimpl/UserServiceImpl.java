package com.velocity.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.entity.User;
import com.velocity.insurance.repository.UserRepository;
import com.velocity.insurance.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		
		User user1=userRepository.save(user);
		return user1;
		
	}
	public void deleteUser(Integer Id) {
		userRepository.deleteById(Id);
	}

}
