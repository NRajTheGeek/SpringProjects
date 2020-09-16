package edu.nraj.dto;

import java.util.List;

// If product with same ID and name exists then 
// only append availabilityZip codes and add the seller to the sellers list
public class ProductReqDTO {
	
	private String productId;
	
	private String name;
	
	private double basePrice;
	
	private double offerPrice;	

	private String typeId;
	
	private List<String> availableZipCodes;
	
	private String sellerId;

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

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public List<String> getAvailableZipCodes() {
		return availableZipCodes;
	}

	public void setAvailableZipCodes(List<String> availableZipCodes) {
		this.availableZipCodes = availableZipCodes;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
}
