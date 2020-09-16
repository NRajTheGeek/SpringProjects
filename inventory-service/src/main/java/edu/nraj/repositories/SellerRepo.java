package edu.nraj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.nraj.models.Seller;

@Repository
public interface SellerRepo extends JpaRepository<Seller, Integer> {

	public Seller findBySellerId(String sellerId);
}
