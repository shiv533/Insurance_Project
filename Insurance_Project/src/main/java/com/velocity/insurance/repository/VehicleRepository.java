package com.velocity.insurance.repository;

import org.springframework.data.repository.CrudRepository;


import com.velocity.insurance.entity.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle,Integer>{

}
