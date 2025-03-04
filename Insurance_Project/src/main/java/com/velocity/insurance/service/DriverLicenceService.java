package com.velocity.insurance.service;

import com.velocity.insurance.entity.DriverLicence;

public interface DriverLicenceService {
  
	public DriverLicence saveDriverLicence(DriverLicence driverLicence);
	public DriverLicence updateDriverLicence(DriverLicence driverLicence);
	public Iterable<DriverLicence> getAllDriverLicence();
	public void deleteDriverLicenceById(Integer licence_id);
}
