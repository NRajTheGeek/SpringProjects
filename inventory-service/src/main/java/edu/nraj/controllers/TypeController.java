package edu.nraj.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.nraj.entities.Types;
import edu.nraj.repositories.TypeRepo;

@RestController
public class TypeController {
	
	@Autowired
	private TypeRepo typeRepo;
	
	@GetMapping("/types/{name}")
	public Types saveType(@PathVariable(name = "name") String name) {
		return typeRepo.findByName(name);		
	}

}
