package com.velocity.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.entity.Policy;
@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer>{
	List<Policy> findByUserId(Integer userId);
}
