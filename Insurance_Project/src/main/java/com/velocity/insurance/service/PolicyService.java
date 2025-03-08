package com.velocity.insurance.service;

import java.util.List;

import com.velocity.insurance.entity.Policy;

public interface PolicyService {

	List<Policy> getPoliciesByUserId(Integer userId);
}
