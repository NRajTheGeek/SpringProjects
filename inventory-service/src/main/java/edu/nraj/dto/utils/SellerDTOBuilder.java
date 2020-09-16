package edu.nraj.dto.utils;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.nraj.dto.SellerResDTO;
import edu.nraj.models.Product;
import edu.nraj.models.Seller;

@Service
public class SellerDTOBuilder {
	public SellerResDTO BuildSellerDTO(Seller seller) {
		SellerResDTO sellerReqResDTO = new SellerResDTO();
		
		sellerReqResDTO.setSellerId(seller.getSellerId());
		sellerReqResDTO.setStatus(seller.getStatus());
		
		List<String> products = new LinkedList<String>();
		
		for (Product product : seller.getProducts()) {
			products.add(product.getProductId());
		}
		
		sellerReqResDTO.setProducts(products);
		
		return sellerReqResDTO;

	}
}
