package edu.nraj.dto;

import java.util.HashMap;
import java.util.Map;


public class ProductResDTO {
		
	private String productId;
	
	private String name;
	
	private double basePrice;
	
	private double offerPrice;
	
	private String[] sellers = {""};
	
	private String[] availabilityZipCodes = {""};
	
	private Map<String, String> type = new HashMap<String, String>();

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public double getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(double offerPrice) {
		this.offerPrice = offerPrice;
	}

	public String[] getSellers() {
		return sellers;
	}

	public void setSellers(String[] sellers) {
		this.sellers = sellers;
	}

	public String[] getAvailabilityZipCodes() {
		return availabilityZipCodes;
	}

	public void setAvailabilityZipCodes(String[] availabilityZip) {
		this.availabilityZipCodes = availabilityZip;
	}

	public Map<String, String> getType() {
		return type;
	}

	public void setType(Map<String, String> type) {
		this.type = type;
	}
	
	
}
