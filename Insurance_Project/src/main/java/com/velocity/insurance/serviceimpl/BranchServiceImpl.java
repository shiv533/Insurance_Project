package com.velocity.insurance.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.entity.Branch;
import com.velocity.insurance.repository.BranchRepository;
import com.velocity.insurance.service.BranchService;

@Service
public class BranchServiceImpl implements BranchService {

	@Autowired
	private BranchRepository branchRepository;

	@Override
	public Branch saveBranch(Branch branch) {

		Branch br = branchRepository.save(branch);
		return br;
	}

	@Override
	public Branch updateBranch(Branch branch) {
		Branch br=branchRepository.save(branch);
		return br;
	}

	@Override
	public Branch getBranchbyId(Long id) {
		Optional<Branch> branch=branchRepository.findById(id);
		return branch.orElse(null);
	}

}
