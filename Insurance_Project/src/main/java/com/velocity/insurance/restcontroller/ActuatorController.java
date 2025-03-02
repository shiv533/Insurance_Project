package com.velocity.insurance.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {

	@GetMapping("/actuatorTest") 
	public String getActuatorDemo() { 
	return "Spring boot actuator test details"; 
	} 
}
