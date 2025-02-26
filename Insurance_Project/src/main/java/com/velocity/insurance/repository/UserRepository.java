package com.velocity.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.velocity.insurance.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
