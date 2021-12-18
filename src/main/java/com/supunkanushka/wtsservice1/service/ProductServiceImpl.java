package com.supunkanushka.wtsservice1.service;

import com.supunkanushka.wtsservice1.model.Product;
import com.supunkanushka.wtsservice1.repository.ProductRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;

	@Override
	public Product save(@NonNull Product product) {
		return productRepository.save(product);
	}

	@Override
	public Optional<Product> fetchProductById(@NonNull Integer id) {
		return productRepository.findById(id);
	}

	@Override
	public List<Product> fetchAllProducts() {
		return productRepository.findAll();
	}
}
