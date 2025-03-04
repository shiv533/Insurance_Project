package com.velocity.insurance.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.entity.DriverLicence;
import com.velocity.insurance.repository.DriverLicenceRepository;
import com.velocity.insurance.service.DriverLicenceService;


@Service
public class DriverLicenceServiceImpl implements DriverLicenceService{
	 @Autowired
		private DriverLicenceRepository driverlicenceRepository;
		@Override
		public DriverLicence saveDriverLicence(DriverLicence driverLicence) {
			// TODO Auto-generated method stub
			DriverLicence driverLicence1 = driverlicenceRepository.save(driverLicence);
			return driverLicence1;
		}

		@Override
		public DriverLicence updateDriverLicence(DriverLicence driverLicence) {
			// TODO Auto-generated method stub
			DriverLicence driverLicence2 = driverlicenceRepository.save(driverLicence);
			return driverLicence2;
			
		}

		@Override
		public Iterable<DriverLicence> getAllDriverLicence() {
			// TODO Auto-generated method stub
			Iterable<DriverLicence> driverLicence3 = driverlicenceRepository.findAll();
			return driverLicence3;
		}

		@Override
		public void deleteDriverLicenceById(Integer licence_id) {
			// TODO Auto-generated method stub
			driverlicenceRepository.deleteById(licence_id);
		}
}
