package edu.nraj.models;

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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@Access(AccessType.FIELD)
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 60)
	private String sellerId;
	
	@Column(nullable = false)
	private char status;
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param sellerId
	 * @param status: 'A' for active, 'I' for inactive
	 */
	public Seller(String sellerId, char status) {
		this.sellerId = sellerId;
		this.status = status;
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="SELLERS_PRODUCTS", joinColumns=@JoinColumn(name = "SELLER_ID"), 
	inverseJoinColumns = @JoinColumn(name="PRODUCT_ID"))
	private List<Product> products = new LinkedList<Product>();

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public int getId() {
		return id;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}
}
