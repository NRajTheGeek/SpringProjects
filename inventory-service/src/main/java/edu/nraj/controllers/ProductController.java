package edu.nraj.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import edu.nraj.dto.ProductReqDTO;
import edu.nraj.dto.ProductResDTO;
import edu.nraj.services.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	// /api/v1/products
	@GetMapping("/api/v1/products/{productId}")
	public @ResponseBody ProductResDTO getProductByProductId(@PathVariable(value = "productId") String productId) {
		System.out.println(productId);
		return productService.getProduct(productId);	
	}
	
	@PostMapping("/api/v1/products")
	public @ResponseBody ProductResDTO addProduct(@RequestBody ProductReqDTO productReqBody) {
		
		return productService.saveProduct(productReqBody);
		
	}
}
