package com.velocity.insurance.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.velocity.insurance.entity.Vehicle;
import com.velocity.insurance.service.VehicleService;

@RestController
public class VehicleController {
    
	@Autowired
	private VehicleService vehicleService;
	

	@PostMapping("/saveVehicle")
	public Vehicle saveVehicle(@RequestBody Vehicle vehicle) {
		Vehicle vehicle1  =  vehicleService.saveVehicle(vehicle);
	return vehicle1;
	}
	
	@PutMapping("/updateVehicle")
	public Vehicle updateVehicle(@RequestBody Vehicle vehicle) {
		Vehicle vehicle2  =  vehicleService.saveVehicle(vehicle);
	return vehicle2;
	}
	
	@GetMapping("/getAllVehicle")
	public Iterable<Vehicle> getAllVehicle() throws Exception {
		return vehicleService.getAllVehicle();
	}
	
	@DeleteMapping("/deleteVehicle")
	public Vehicle deleteVehicleById(@PathVariable("Vehicle_Number") Integer Vehicle_Number) {
		Vehicle vehicle4 = vehicleService.deleteVehicle(Vehicle_Number);
	return vehicle4;
	}
}
