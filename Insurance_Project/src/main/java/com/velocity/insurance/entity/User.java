package com.velocity.insurance.entity;
    //@Author Kaveri

import java.util.List;
import java.util.Set;

import org.hibernate.annotations.Proxy;

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
	private String name;
	private String email;

	@OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Nominee> nominees;
	
	@OneToMany(mappedBy = "InsuranceId", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Claim> claimList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Nominee> getNominees() {
		return nominees;
	}

	public void setNominees(List<Nominee> nominees) {
		this.nominees = nominees;
	}

	public List<Claim> getClaimList() {
		return claimList;
	}

	public void setClaimList(List<Claim> claimList) {
		this.claimList = claimList;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", nominees=" + nominees + ", claimList="
				+ claimList + "]";
	}

}
