package com.velocity.insurance.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.velocity.insurance.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

	Optional<User> findByFirstName(String firstName);

	Optional<User> findByEmailId(String emailId);

	Optional<User> findByLastName(String lastName);

	 Optional<User> findByUsername(String username);
}
