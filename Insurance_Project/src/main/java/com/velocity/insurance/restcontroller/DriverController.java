package com.velocity.insurance.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.entity.Driver;
import com.velocity.insurance.service.DriverService;



@RestController
@RequestMapping("/driver")
public class DriverController {

	 @Autowired
	    private DriverService driverService;

	    @PostMapping("/saveDriver")
	    public ResponseEntity<Driver> saveDriver(@RequestBody Driver driver) {
	        return ResponseEntity.ok(driverService.saveDriver(driver));
	    }

	    @PutMapping("/updateDriver")
	    public ResponseEntity<Driver> updateDriver(@RequestBody Driver driver) {
	        return ResponseEntity.ok(driverService.updateDriver(driver));
	    }

	    @GetMapping("/getAllDrivers")
	    public ResponseEntity<List<Driver>> getAllDrivers() {
	        return ResponseEntity.ok(driverService.getAllDrivers());
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<?> getDriverById(@PathVariable int id) {
	        Optional<Driver> driver = driverService.getDriverById(id);
	        return driver.<ResponseEntity<Object>>map(ResponseEntity::ok)
	                 .orElseGet(() -> ResponseEntity.status(404).body("Driver not found"));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<?> deleteDriver(@PathVariable int id) {
	        Optional<Driver> driver = driverService.getDriverById(id);
	        if (driver.isPresent()) {
	            driverService.deleteDriver(id);
	            return ResponseEntity.noContent().build();
	        } else {
	            return ResponseEntity.status(404).body("Driver not found");
	        }
	    }
}
