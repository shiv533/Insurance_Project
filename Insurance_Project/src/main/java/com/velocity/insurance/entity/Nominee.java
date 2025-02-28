package com.velocity.insurance.entity;
    //@Author Kaveri

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name ="nominee")
public class Nominee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nominees_seq")
	@SequenceGenerator(name="nominees_seq", sequenceName= "nominees_seq", allocationSize=1)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer nomineeId;
	private String name;
	private String status;

    private Integer userId;

	
//	@ManyToMany(mappedBy = "nomineeList")
//	private Set<User> userList;
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId1) {
		this.userId = userId1;
	}
	public Integer getNomineeId() {
		return nomineeId;
	}
	public void setNomineeId(Integer nomineeId) {
		this.nomineeId = nomineeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	
	@Override
	public String toString() {
		return "Nominee [nomineeId=" + nomineeId + ", name=" + name + ", status=" + status + ", userId=" + userId + "]";
	}
	
	
	



}
