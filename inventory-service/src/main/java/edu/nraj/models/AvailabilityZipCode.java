package edu.nraj.models;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Access(AccessType.FIELD)
public class AvailabilityZipCode {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable = false, length = 9)
	private String zipCode;
	
	public AvailabilityZipCode() {
		// TODO Auto-generated constructor stub
	}
	
	public AvailabilityZipCode(String zip) {
		zipCode = zip;
	}

	public int getId() {
		return id;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	
	
}
