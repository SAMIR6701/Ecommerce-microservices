package com.example.demo.productController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.product.Product;
import com.example.demo.productService.ProductServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

	@Autowired
	private final ProductServiceImpl serv;

	@PostMapping()
	public Product createProduct(@RequestBody Product product) {
		return serv.save(product);
	}

	@GetMapping()
	public List<Product> getAllProduct() {
		return serv.getAllProducts();
	}

}
