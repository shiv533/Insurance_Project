package com.velocity.insurance.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.entity.DriverLicence;
import com.velocity.insurance.service.DriverLicenceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "DriverLicence", description = "DriverLicence API Information")
@RestController
public class DriverLicenceController {
	@Autowired
	private DriverLicenceService driverLicenceService;
	
	@PostMapping("/saveDriverLicence")
	@Operation(summary = "Save DriverLicence Data", description = "Rest APIused to store DriverLicence data")
	@ApiResponses(value = { @ApiResponse(responseCode = "200",description = "successful operation") })
	public DriverLicence saveDriverLicence(@RequestBody DriverLicence driverLicence) {
		DriverLicence dLicence =  driverLicenceService.saveDriverLicence(driverLicence);
	return dLicence;
	}
    
	@PutMapping("/updateDriverLicence")
	@Operation(summary = " update DriverLicence Data", description = "Rest APIused to update DriverLicence data")
	@ApiResponses(value = { @ApiResponse(responseCode = "200",description = "successful operation") })
	public DriverLicence updateEmployee(@RequestBody DriverLicence driverLicence) {
		DriverLicence dLicence1 = driverLicenceService.updateDriverLicence(driverLicence);
	return dLicence1;
	}
	
	@GetMapping("/getAllDriverLicence")
	@Operation(summary = " fetching DriverLicence Data", description = "Rest APIused to fetching DriverLicence data")
	@ApiResponses(value = { @ApiResponse(responseCode = "200",description = "successful operation") })
	public Iterable<DriverLicence> getAllDriverLicence() throws Exception {
		return driverLicenceService.getAllDriverLicence();
	}
	
	@DeleteMapping("/deleteDriverLicence/{id}")
	@Operation(summary = " delete DriverLicence Data", description = "Rest APIused to delete DriverLicence data")
	@ApiResponses(value = { @ApiResponse(responseCode = "200",description = "successful operation") })
	public void getEmployeeById(@PathVariable("licence_id") Integer licence_id) throws Exception {
		driverLicenceService.deleteDriverLicenceById(licence_id);
	}
}

