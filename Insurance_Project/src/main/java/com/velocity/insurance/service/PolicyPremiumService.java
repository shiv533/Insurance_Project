package com.velocity.insurance.service;

import java.util.List;

import com.velocity.insurance.entity.PolicyPremium;

public interface PolicyPremiumService {

	List<PolicyPremium> getPremiumsByPolicyId(Integer policyId);
}
