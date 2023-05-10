package com.app.webstore.service;

import java.util.List;
import java.util.Map;

import com.app.webstore.domain.Product;

public interface ProductService {
	
	void updateAllStock();
	
	List<Product> getAllProducts();
	
	List<Product> getProductsByCategory(String category);
	
	List<Product> getProductsByFilter(Map<String, List<String>> filterParams);
	
	Product getProductById(String prodcutID);
	
	void addProduct(Product product);
	

}
