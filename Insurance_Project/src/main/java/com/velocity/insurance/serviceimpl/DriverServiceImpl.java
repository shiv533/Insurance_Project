package com.velocity.insurance.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.entity.Driver;
import com.velocity.insurance.repository.DriverRepository;
import com.velocity.insurance.service.DriverService;
@Service
public class DriverServiceImpl implements DriverService{

	 @Autowired
	    private DriverRepository driverRepository;

	    @Override
	    public Driver saveDriver(Driver driver) {
	        return driverRepository.save(driver);
	    }

	    @Override
	    public Driver updateDriver(Driver driver) {
	        return driverRepository.save(driver);
	    }

	    @Override
	    public List<Driver> getAllDrivers() {
	        return driverRepository.findAll();
	    }

	    @Override
	    public Optional<Driver> getDriverById(int id) {
	        return driverRepository.findById(id);
	    }

	    @Override
	    public void deleteDriver(int id) {
	        driverRepository.deleteById(id);
	    }

	
}
