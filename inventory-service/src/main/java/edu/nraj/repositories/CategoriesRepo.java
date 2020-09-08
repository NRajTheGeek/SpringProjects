package edu.nraj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.nraj.entities.Categories;

@Repository
public interface CategoriesRepo extends JpaRepository<Categories, Integer> {

}
