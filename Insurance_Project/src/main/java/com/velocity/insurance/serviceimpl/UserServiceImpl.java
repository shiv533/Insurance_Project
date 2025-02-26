package com.velocity.insurance.serviceimpl;

import java.util.List;
import java.util.Optional;

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

		User user1 = userRepository.save(user);
		return user1;

	}

	@Override
	public User getUserById(Integer id) {
		User find = userRepository.getById(id);
		return find;
	}

}
