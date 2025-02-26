package com.velocity.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.entity.Nominee;
@Repository 
public interface NomineeRepository extends JpaRepository<Nominee, Integer> {
	

}
