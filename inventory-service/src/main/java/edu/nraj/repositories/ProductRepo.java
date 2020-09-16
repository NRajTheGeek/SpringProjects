package edu.nraj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.nraj.models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	
	public Product findByProductId(String productId);
}
