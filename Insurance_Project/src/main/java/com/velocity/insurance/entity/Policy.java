package com.velocity.insurance.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "policy")
public class Policy {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "policy_seq")
	@SequenceGenerator(name = "policy_seq", sequenceName = "policy_seq", allocationSize = 1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String policyNo;
	private String policyName;
	private String policyStatus;

	@OneToMany(mappedBy = "policy", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<PolicyPremium> policyPremiums;

	public List<PolicyPremium> getPolicyPremiums() {
		return policyPremiums;
	}

	public void setPolicyPremiums(List<PolicyPremium> policyPremiums) {
		this.policyPremiums = policyPremiums;
	}

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	@JsonBackReference
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getPolicyId() {
		return id;
	}

	public void setPolicyId(Integer policyId) {
		this.id = policyId;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

}
