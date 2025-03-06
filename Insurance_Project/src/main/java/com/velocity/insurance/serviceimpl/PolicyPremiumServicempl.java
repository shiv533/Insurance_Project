package com.velocity.insurance.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.entity.PolicyPremium;
import com.velocity.insurance.repository.PolicyPremiumRepository;
import com.velocity.insurance.service.PolicyPremiumService;
@Service
public class PolicyPremiumServicempl implements PolicyPremiumService{

	@Autowired
	private PolicyPremiumRepository policyPremiumRepository;
	
	@Override
	public List<PolicyPremium> getPremiumsByPolicyId(Integer policyId) {
		return policyPremiumRepository.findByPolicy_Id(policyId);
	}

}
