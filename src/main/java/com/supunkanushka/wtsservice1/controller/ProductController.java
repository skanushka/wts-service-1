package com.supunkanushka.wtsservice1.controller;

import com.supunkanushka.wtsservice1.model.Product;
import com.supunkanushka.wtsservice1.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class ProductController {

	private final ProductService productService;

	@PostMapping(path = "/product")
	public Product save(@RequestBody Product product) {
		return productService.save(product);
	}

	@GetMapping(path = "/product/{id}")
	public ResponseEntity<Product> fetchProduct(@PathVariable("id") int id) {
		Product product = productService.fetchProductById(id).orElse(null);
		if (product == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(product);
	}

	@GetMapping(path = "/product")
	public ResponseEntity<List<Product>> fetchProducts() {
		List<Product> products = productService.fetchAllProducts();

		return ResponseEntity.ok(products);
	}
}
