package com.velocity.insurance.service;

import com.velocity.insurance.entity.User;

public interface UserService {
	public User saveUser(User user);

	public User getUserById(Integer id);

}
