package com.example.demo.productService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.product.Product;
import com.example.demo.productRepository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private final ProductRepository repo;

	@Override
	public Product save(Product product) {
		
		return repo.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return repo.findAll();
	}

}
