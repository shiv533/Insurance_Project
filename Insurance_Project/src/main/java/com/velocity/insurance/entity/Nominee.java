package com.velocity.insurance.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Nominee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nominees_seq")
	@SequenceGenerator(name="nominees_seq", sequenceName= "nominees_seq", allocationSize=1)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer nomineeId;
	private String name;
	private String status;
	private Integer userid;
	
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
	public Integer getUserList() {
		return userid;
	}
	public void setUserList(Set<User> userList) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Nominee [nomineeId=" + nomineeId + ", name=" + name + ", status=" + status + ", userList=" + userid
				+ "]";
	}
	


}
