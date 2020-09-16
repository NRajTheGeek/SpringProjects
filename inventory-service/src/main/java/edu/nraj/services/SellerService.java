package edu.nraj.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.nraj.dto.SellerResDTO;
import edu.nraj.dto.utils.SellerDTOBuilder;
import edu.nraj.models.Seller;
import edu.nraj.repositories.SellerRepo;

@Service
public class SellerService {
	
	@Autowired
	SellerRepo sellerRepo;
	
	@Autowired
	SellerDTOBuilder sellerDTOBuilder;
	
	public SellerResDTO getSeller(String sellerId) {
		Seller seller = sellerRepo.findBySellerId(sellerId);
		SellerResDTO sellerReqResDTO = sellerDTOBuilder.BuildSellerDTO(seller);
		return sellerReqResDTO;
	}
}
