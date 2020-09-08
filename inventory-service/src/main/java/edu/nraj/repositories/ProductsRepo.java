package edu.nraj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.nraj.entities.Products;

@Repository
public interface ProductsRepo extends JpaRepository<Products, Integer> {
	
}
