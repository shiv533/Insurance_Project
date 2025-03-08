package com.velocity.insurance.entity;
//@Author Kaveri

import java.util.List;
import java.util.Set;

import org.hibernate.annotations.Proxy;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")

@Proxy(lazy = false)
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
	private Integer id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNo;

	@OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Nominee> nominees;
	
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Policy> policies;

	

	public List<Policy> getPolicies() {
		return policies;
	}

	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}
>>>>>>> 707b5ff46e5518b93ede3d48235ffd71c0e8bddd

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Policy> policies;

	

	public List<Policy> getPolicies() {
		return policies;
	}

	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}
>>>>>>> 707b5ff46e5518b93ede3d48235ffd71c0e8bddd

	@OneToMany(mappedBy = "InsuranceId", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Claim> claimList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Policy> policies;

	

	public List<Policy> getPolicies() {
		return policies;
	}

	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}


	public Integer getId() {
		return id;
	}

<<<<<<< HEAD
<<<<<<< HEAD

	public void setId(Integer id) {
		this.id = id;}

=======
>>>>>>> 707b5ff46e5518b93ede3d48235ffd71c0e8bddd
=======
>>>>>>> 707b5ff46e5518b93ede3d48235ffd71c0e8bddd
	public void setUserId(Integer userId) {
		this.id = userId;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public List<Nominee> getNominees() {
		return nominees;
	}

	public void setNominees(List<Nominee> nominees) {
		this.nominees = nominees;
	}

<<<<<<< HEAD
<<<<<<< HEAD
	public List<Claim> getClaimList() {
		return claimList;
	}

	public void setClaimList(List<Claim> claimList) {
		this.claimList = claimList;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", mobileNo=" + mobileNo + ", nominees=" + nominees + ", claimList=" + claimList + ", policies="
				+ policies + "]";
	}

	

=======
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", mobileNo=" + mobileNo + ", nominees=" + nominees + "]";
	}

>>>>>>> 707b5ff46e5518b93ede3d48235ffd71c0e8bddd
=======
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", mobileNo=" + mobileNo + ", nominees=" + nominees + "]";
	}

>>>>>>> 707b5ff46e5518b93ede3d48235ffd71c0e8bddd

}
