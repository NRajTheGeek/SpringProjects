package edu.nraj.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.nraj.models.Type;
import edu.nraj.repositories.TypeRepo;

@RestController
public class TypeController {
	
	@Autowired
	private TypeRepo typeRepo;
	
	@GetMapping("/types/{name}")
	public Type getTypeDetails(@PathVariable(name = "name") String name) {
		return typeRepo.findByName(name);		
	}

}
