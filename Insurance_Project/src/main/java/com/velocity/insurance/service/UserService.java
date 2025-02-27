package com.velocity.insurance.service;

import com.velocity.insurance.entity.User;

public interface UserService {
	public User saveUser(User user);


	public void deleteUser(Integer Id);


	public User getUserById(Integer id);




}
