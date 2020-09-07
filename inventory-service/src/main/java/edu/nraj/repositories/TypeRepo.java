package edu.nraj.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.nraj.entities.Types;

@Repository
public interface TypeRepo extends CrudRepository<Types, Integer> {

}
