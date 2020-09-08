package edu.nraj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.nraj.entities.Types;

@Repository
public interface TypeRepo extends JpaRepository<Types, Integer> {
	
	public Types findByName(String name);
}
