package edu.nraj.models;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Access(AccessType.FIELD)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 60)
	private String productId;
	
	@Column(nullable = false, length = 256)
	private String name;
	
	@Column(nullable = false, scale = 10)
	private double basePrice;
	
	@Column(nullable = true, scale = 10)
	private double offerPrice;	

	@Column(nullable = false, updatable = false, length = 60)
	private String createdBy;
	
	@Column(nullable = false, updatable = false)
	private Date createdAt;
	
	// unidirectional
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="TYPE_ID", nullable = false, referencedColumnName = "id")
	private Type types;
	
	// putting Join Column here will create a cyclic dependency issue
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "products")
	private List<Seller> sellers = new LinkedList<Seller>();
	
	// Unidirectional
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="AVAILABLE_ZIP", referencedColumnName="id")
	private List<AvailabilityZipCode> availabilityZip = new LinkedList<AvailabilityZipCode>();

	
	
	public int getId() {
		return id;
	}

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

	public List<AvailabilityZipCode> getAvailabilityZip() {
		return availabilityZip;
	}

	public void setAvailabilityZip(AvailabilityZipCode availabilityZip) {
		this.availabilityZip.add(availabilityZip);
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

	public Type getType() {
		return types;
	}

	public void setType(Type type) {
		this.types = type;
	}

	public List<Seller> getSellers() {
		return sellers;
	}

	public void setSellers(Seller seller) {
		this.sellers.add(seller);
	}
	
}
