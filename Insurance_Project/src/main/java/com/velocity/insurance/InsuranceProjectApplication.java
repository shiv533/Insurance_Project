package com.velocity.insurance;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableEurekaServer
@EnableTransactionManagement
@SpringBootApplication
public class InsuranceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceProjectApplication.class, args);
	}

}
