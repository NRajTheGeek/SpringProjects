package edu.nraj.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String productId;
	
	private String name;
	
	private double basePrice;
	
	private double actualPrice;
	
	private double offerPrice;	

	private String createdBy;
	
	private Date createdAt;
	@OneToOne
	@JoinColumn(name="id")
	private Types types;
	
	@ManyToMany
	@JoinColumn(name="id")
	private List<Sellers> sellers;
	
	@OneToOne
	private AvailabilityZipCodes availabilityZip;

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

	public double getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(double actualPrice) {
		this.actualPrice = actualPrice;
	}

	public double getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(double offerPrice) {
		this.offerPrice = offerPrice;
	}

	public AvailabilityZipCodes getAvailabilityZip() {
		return availabilityZip;
	}

	public void setAvailabilityZip(AvailabilityZipCodes availabilityZip) {
		this.availabilityZip = availabilityZip;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Types getType() {
		return types;
	}

	public void setType(Types type) {
		this.types = type;
	}

	public List<Sellers> getSellers() {
		return sellers;
	}

	public void setSellers(List<Sellers> sellers) {
		this.sellers = sellers;
	}
	
}
