package edu.nraj.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.nraj.dto.SellerResDTO;
import edu.nraj.services.SellerService;

@RestController
public class SellerController {
	
	@Autowired
	SellerService sellerService;
	
	@GetMapping("/api/v1/sellers/{sellerId}")
	public @ResponseBody SellerResDTO getSeller(@PathVariable(value = "sellerId") String sellerId) {
		SellerResDTO sellerReqResDTO = sellerService.getSeller(sellerId);
		return sellerReqResDTO;
	}

}
