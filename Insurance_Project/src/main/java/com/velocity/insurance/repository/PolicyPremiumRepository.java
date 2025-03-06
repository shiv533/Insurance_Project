package com.velocity.insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.velocity.insurance.entity.PolicyPremium;

@Repository
public interface PolicyPremiumRepository extends JpaRepository<PolicyPremium, Integer> {

	 List<PolicyPremium> findByPolicy_Id(Integer policyId);
}
