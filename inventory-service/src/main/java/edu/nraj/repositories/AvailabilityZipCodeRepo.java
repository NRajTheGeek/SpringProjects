package edu.nraj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.nraj.models.AvailabilityZipCode;

@Repository
public interface AvailabilityZipCodeRepo extends JpaRepository<AvailabilityZipCode, Integer> {
	
	public AvailabilityZipCode findByZipCode(String zipCode);
}
