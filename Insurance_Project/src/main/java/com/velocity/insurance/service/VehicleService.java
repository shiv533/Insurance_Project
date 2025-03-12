package com.velocity.insurance.service;

import com.velocity.insurance.entity.Vehicle;

public interface VehicleService {

	public Vehicle saveVehicle(Vehicle vehicle);
	public Vehicle updateVehicle(Vehicle vehicle);
	public Iterable<Vehicle> getAllVehicle();
	public Vehicle deleteVehicle(Integer Vehicle_Number);
}
