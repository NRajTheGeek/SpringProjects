package edu.nraj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.nraj.models.Type;

@Repository
public interface TypeRepo extends JpaRepository<Type, Integer> {
	
	public Type findByName(String name);
	
	public Type findByTypeId(String typeId);
}
