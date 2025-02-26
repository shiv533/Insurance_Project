package com.velocity.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.entity.Nominee;
import com.velocity.insurance.repository.NomineeRepository;
import com.velocity.insurance.service.NomineeService;
@Service
public class NomineeServiceImpl implements NomineeService{
	@Autowired
private NomineeRepository nomineeRepository;
	@Override
	public Nominee getNomineeData(Nominee nominee) {
	Nominee nom2=	nomineeRepository.save(nominee);
		// TODO Auto-generated method stub
		return nom2;
	}

}
