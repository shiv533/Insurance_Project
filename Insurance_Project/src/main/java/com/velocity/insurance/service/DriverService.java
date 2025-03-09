package com.velocity.insurance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.velocity.insurance.entity.Driver;
@Service
public interface DriverService {

	Driver saveDriver(Driver driver);
    Driver updateDriver(Driver driver);
    List<Driver> getAllDrivers();
    Optional<Driver> getDriverById(int id);
    void deleteDriver(int id);
}
