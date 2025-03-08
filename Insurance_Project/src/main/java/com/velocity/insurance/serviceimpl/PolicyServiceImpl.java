package com.velocity.insurance.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.entity.Policy;
import com.velocity.insurance.repository.PolicyRepository;
import com.velocity.insurance.service.PolicyService;
@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public List<Policy> getPoliciesByUserId(Integer userId) {
		return policyRepository.findByUserId(userId);
	}

}
