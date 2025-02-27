package com.velocity.insurance.entity;

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

public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private Integer Id;
private String name;
private String email;
@OneToMany(mappedBy = "userid", cascade = CascadeType.ALL, orphanRemoval = true)
private Set<Nominee> nomineeList;

public Integer getId() {
	return Id;
}
public void setId(Integer Id) {
	this.Id = Id;
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

public Set<Nominee> getNomineeList() {
	return nomineeList;
}
public void setNomineeList(Set<Nominee> nomineeList) {
	this.nomineeList = nomineeList;
}
@Override
public String toString() {
	return "User [userId=" + Id + ", name=" + name + ", email=" + email + ", nomineeList=" + nomineeList + "]";
}


}
