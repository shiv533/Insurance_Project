package com.velocity.insurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "branch")
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "branch_seq")
	@SequenceGenerator(name = "branch_seq", sequenceName = "branch_seq", allocationSize = 1)
	private Long id;

	private String branchName;
	private String branchId;
	private String city;
	private String postalCode;
	private String country;

	// Generate Getter and Setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// Generate ToString method
	@Override
	public String toString() {
		return "Branch [id=" + id + ", branchName=" + branchName + ", branchId=" + branchId + ", city=" + city
				+ ", postalCode=" + postalCode + ", country=" + country + "]";
	}

}
