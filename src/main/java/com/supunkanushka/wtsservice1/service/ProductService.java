package com.supunkanushka.wtsservice1.service;

import com.supunkanushka.wtsservice1.model.Product;
import lombok.NonNull;

import java.util.List;
import java.util.Optional;

public interface ProductService {

	Product save(@NonNull Product product);

	Optional<Product> fetchProductById(@NonNull Integer id);

	List<Product> fetchAllProducts();
}
