package com.velocity.insurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Vehicle_Details")
public class Vehicle {

	   @Id   
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   private Integer Vehicle_Number;
	   private String Vehicle_Name;
	   private String Vehicle_Type;
	   private long Vehicle_Price;
	public Integer getVehicle_Number() {
		return Vehicle_Number;
	}
	public void setVehicle_Number(Integer vehicle_Number) {
		Vehicle_Number = vehicle_Number;
	}
	public String getVehicle_Name() {
		return Vehicle_Name;
	}
	public void setVehicle_Name(String vehicle_Name) {
		Vehicle_Name = vehicle_Name;
	}
	public String getVehicle_Type() {
		return Vehicle_Type;
	}
	public void setVehicle_Type(String vehicle_Type) {
		Vehicle_Type = vehicle_Type;
	}
	public long getVehicle_Price() {
		return Vehicle_Price;
	}
	public void setVehicle_Price(long vehicle_Price) {
		Vehicle_Price = vehicle_Price;
	}
	@Override
	public String toString() {
		return "Vehicle [Vehicle_Number=" + Vehicle_Number + ", Vehicle_Name=" + Vehicle_Name + ", Vehicle_Type="
				+ Vehicle_Type + ", Vehicle_Price=" + Vehicle_Price + "]";
	}
	   
}
