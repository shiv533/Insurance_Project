package com.velocity.insurance.entity;



import java.util.Set;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="UserList")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name="user_seq", sequenceName= "user_seq", allocationSize=1)
private Integer userId;
private String name;
private String email;
@ManyToMany(cascade = CascadeType.ALL)
private Set<Nominee> nomineeList;

public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
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
	return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", nomineeList=" + nomineeList + "]";
}


}
