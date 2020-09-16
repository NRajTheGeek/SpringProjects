package edu.nraj.dto.utils;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import edu.nraj.dto.ProductResDTO;
import edu.nraj.models.AvailabilityZipCode;
import edu.nraj.models.Product;
import edu.nraj.models.Seller;

@Service
public class ProductDTOBuilder {
	
	public ProductResDTO createProductResponseDTO(Product product) {
		ProductResDTO productRes = new ProductResDTO();
		
		productRes.setProductId(product.getProductId());
		productRes.setName(product.getName());
		productRes.setBasePrice(product.getBasePrice());
		productRes.setOfferPrice(product.getOfferPrice());
			
		String[] sellers = new String[product.getSellers().size()];
		int i = 0;
		for (Seller seller : product.getSellers()) {
			sellers[i] = seller.getSellerId();
			i++;
		}	
		productRes.setSellers(sellers);
		
		HashMap<String, String> type = new HashMap<String, String>();
		type.put(product.getType().getTypeId(), product.getType().getName());
		
		productRes.setType(type);
		
		String[] availabilityZipCodes = new String[product.getAvailabilityZip().size()];
		i = 0;
		for (AvailabilityZipCode availabilityZipCode : product.getAvailabilityZip()) {
			availabilityZipCodes[i] = availabilityZipCode.getZipCode();
			i++;
		}	
		
		productRes.setAvailabilityZipCodes(availabilityZipCodes);
		
		return productRes;

	}
	
}
