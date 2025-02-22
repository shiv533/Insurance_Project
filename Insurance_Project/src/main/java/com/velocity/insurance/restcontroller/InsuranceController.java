package com.velocity.insurance.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class InsuranceController {

	@GetMapping("/hello")
	public String helloTest() {
		return "This is Industrial project of Group D";
	}
}
