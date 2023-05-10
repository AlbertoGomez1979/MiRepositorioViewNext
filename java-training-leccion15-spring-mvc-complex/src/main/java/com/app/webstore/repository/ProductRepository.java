package com.app.webstore.repository;

import java.util.List;
import java.util.Map;

import com.app.webstore.domain.Product;

public interface ProductRepository {
	
	List<Product> getAllProducts();
	
	void updateStock(String productId, long noOfunits);
	
	List<Product> getProductsByCategory(String category);
	
	List<Product> getProductsByFilter(Map<String, List<String>> filterParams );
	
	Product getProductById(String productoID);
	
	 void addProduct(Product product);

}
