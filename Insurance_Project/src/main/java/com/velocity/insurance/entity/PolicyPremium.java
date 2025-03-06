package com.velocity.insurance.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "policy_premium")
public class PolicyPremium {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "policy_premium_seq")
	@SequenceGenerator(name = "policy_premium_seq", sequenceName = "policy_premium_seq", allocationSize = 1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Long premiumAmount;
	private String premiumType;

	@ManyToOne
	@JoinColumn(name = "policy_id", referencedColumnName = "id")
	@JsonBackReference
	private Policy policy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(Long premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public String getPremiumType() {
		return premiumType;
	}

	public void setPremiumType(String premiumType) {
		this.premiumType = premiumType;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

}
