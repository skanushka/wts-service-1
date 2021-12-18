package com.supunkanushka.wtsservice1.repository;

import com.supunkanushka.wtsservice1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Integer> {
}
