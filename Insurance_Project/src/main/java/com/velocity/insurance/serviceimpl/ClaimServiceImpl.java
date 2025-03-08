package com.velocity.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.entity.Claim;
import com.velocity.insurance.repository.ClaimRepository;
import com.velocity.insurance.service.ClaimService;
@Service
public class ClaimServiceImpl implements ClaimService{
    
	@Autowired
	private ClaimRepository claimRepository;
	@Override
	public Claim saveClaim(Claim claims) {
		// TODO Auto-generated method stub
		Claim claim1 = claimRepository.save(claims);
		return claim1;
	}

}
