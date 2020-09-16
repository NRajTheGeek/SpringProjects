package edu.nraj.dto;

import java.util.LinkedList;
import java.util.List;

import edu.nraj.models.Product;

public class SellerResDTO {
	
	private String sellerId;
	
	private char status;
	
	private List<String> products = new LinkedList<String>();

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

	public List<String> getProducts() {
		return products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}
}
