package com.velocity.insurance.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Claim")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Claim {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int InsuranceId;
    private String claimType;
    private String claimMode;
    public long claimAmount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getInsuranceId() {
		return InsuranceId;
	}
	public void setInsuranceId(int insuranceId) {
		InsuranceId = insuranceId;
	}
	public String getClaimType() {
		return claimType;
	}
	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}
	public String getClaimMode() {
		return claimMode;
	}
	public void setClaimMode(String claimMode) {
		this.claimMode = claimMode;
	}
	public long getClaimAmount() {
		return claimAmount;
	}
	public void setClaimAmount(long claimAmount) {
		this.claimAmount = claimAmount;
	}
	@Override
	public String toString() {
		return "Claim [id=" + id + ", InsuranceId=" + InsuranceId + ", claimType=" + claimType + ", claimMode="
				+ claimMode + ", claimAmount=" + claimAmount + "]";
	}
    
}
