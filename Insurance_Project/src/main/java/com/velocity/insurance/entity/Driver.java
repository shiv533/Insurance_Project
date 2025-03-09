package com.velocity.insurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Driver {

	 @Id
	 @GeneratedValue
	    private int id;
	    private String name;
	    private String license;
	    private String mobileNo;
	    private String city;

	    // Getters and Setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getLicense() {
	        return license;
	    }

	    public void setLicense(String license) {
	        this.license = license;
	    }

	    public String getMobileNo() {
	        return mobileNo;
	    }

	    public void setMobileNo(String mobileNo) {
	        this.mobileNo = mobileNo;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

		@Override
		public String toString() {
			return "Driver [id=" + id + ", name=" + name + ", license=" + license + ", mobileNo=" + mobileNo + ", city="
					+ city + "]";
		}
	    
	    
}
