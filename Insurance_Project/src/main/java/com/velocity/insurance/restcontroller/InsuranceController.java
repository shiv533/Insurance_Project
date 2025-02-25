package com.velocity.insurance.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.entity.Branch;

@RestController
//@RequestMapping("/api")
public class InsuranceController {

	@GetMapping("/hello")
	public String helloTest() {
		return "This is Industrial project of Group D";
	}
	
	
}
