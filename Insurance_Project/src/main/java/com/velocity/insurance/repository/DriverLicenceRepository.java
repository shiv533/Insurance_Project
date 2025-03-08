package com.velocity.insurance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.entity.DriverLicence;
@Repository
public interface DriverLicenceRepository extends CrudRepository<DriverLicence,Integer> {

}
