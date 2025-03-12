package com.velocity.insurance.serviceimpl;

import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;


import com.velocity.insurance.entity.Vehicle;
import com.velocity.insurance.repository.VehicleRepository;
import com.velocity.insurance.service.VehicleService;
@Service
public class VehicleServiceImpl implements VehicleService {
    
	@Autowired
	private VehicleRepository vehicleRepository;
	@Override
	public Vehicle saveVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		Vehicle vehicle1 = vehicleRepository.save(vehicle);
		return vehicle1;
       
	}

	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		Vehicle vehicle2 = vehicleRepository.save(vehicle);
		return vehicle2;
	}

	@Override
	public Iterable<Vehicle> getAllVehicle() {
		// TODO Auto-generated method stub
		Iterable<Vehicle> vehicle3 = vehicleRepository.findAll();
		return vehicle3;
	}

	@Override
	public Vehicle deleteVehicle(Integer Vehicle_Number) {
		// TODO Auto-generated method stub

		Optional<Vehicle> vehicle4 = vehicleRepository.findById(Vehicle_Number);
		Vehicle vehicle = null;
		if (vehicle4.isPresent()) {
			vehicle= vehicle4.get();
		}
		return vehicle;
	}
	

}
