package com.velocity.insurance.service;

import java.util.Optional;

import com.velocity.insurance.entity.User;

public interface UserService {
	public User saveUser(User user);

	public void deleteUser(Integer Id);

	public User getUserById(Integer id);

	Optional<User> getUserByFirstName(String firstName);

	Optional<User> getUserByLastName(String lastName);

	Optional<User> getUserByEmailId(String emailId);

	// Method for update user details

	public User updateUser(User user);

}
