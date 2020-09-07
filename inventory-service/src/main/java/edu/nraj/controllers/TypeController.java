package edu.nraj.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.nraj.entities.Types;
import edu.nraj.repositories.TypeRepo;

@RestController
public class TypeController {
	
	@Autowired
	private TypeRepo trepo;
	
	@RequestMapping("/")
	public void saveType() {
		Types type = new Types();
		
		type.setName("Fridge");
		type.setTypeId("wertyu-345678-dfgh678945fgh67");
		
		try {
			Types tp = trepo.save(type);
			System.out.println(tp.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
