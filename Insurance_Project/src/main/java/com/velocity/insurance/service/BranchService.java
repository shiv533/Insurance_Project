package com.velocity.insurance.service;

import java.util.Optional;

import com.velocity.insurance.entity.Branch;

public interface BranchService {

	public Branch saveBranch(Branch branch);
	
	public Branch updateBranch(Branch branch);
	
	public Branch getBranchbyId(Long id);
}
