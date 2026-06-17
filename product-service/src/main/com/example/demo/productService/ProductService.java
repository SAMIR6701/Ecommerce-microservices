package com.example.demo.productService;

import java.util.List;

import com.example.demo.product.Product;

public interface ProductService {
	Product save(Product product);
	List<Product> getAllProducts();

}
