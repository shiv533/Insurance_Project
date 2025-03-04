package com.velocity.insurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Driver_Details")
public class DriverLicence {

	   @Id   
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   private Integer licence_id;
	   private String driver_name;
	   private long driver_phonenumber;
	   private String licence_type;
	   
	   public String getDriver_name() {
			return driver_name;
		}
		public void setDriver_name(String driver_name) {
			this.driver_name = driver_name;
		}
		public long getDriver_phonenumber() {
			return driver_phonenumber;
		}
		public void setDriver_phonenumber(long driver_phonenumber) {
			this.driver_phonenumber = driver_phonenumber;
		}
		public Integer getLicense_id() {
			return licence_id;
		}
		public void setLicense_id(Integer license_id) {
			this.licence_id = license_id;
		}
		public String getLicense_type() {
			return licence_type;
		}
		public void setLicense_type(String license_type) {
			this.licence_type = license_type;
		}
		@Override
		public String toString() {
			return "Driver_License [driver_name=" + driver_name + ", driver_phonenumber=" + driver_phonenumber + ", license_id="
					+ licence_id + ", license_type=" + licence_type + "]";
		}
}
