package com.dennislee.driverslicense.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dennislee.driverslicense.models.License;
import com.dennislee.driverslicense.repositories.LicenseRepository;

@Service
public class LicenseService {

	private LicenseRepository lRepo;
	
	public LicenseService(LicenseRepository repo) {
		this.lRepo = repo;
	}
	
	public List<License> allLicense(){
		return lRepo.findAll();
	}
	
	public License createLicense(License license) {
		license.setNumber(this.generateLicenseNumber());
		return lRepo.save(license);
	}
	
	public int generateLicenseNumber() {
		License l = lRepo.findTopByOrderByNumberDesc();
		if(l == null)
			return 1;
		int largestNumber = l.getNumber();
		largestNumber++;
		return (largestNumber);
	}
}
