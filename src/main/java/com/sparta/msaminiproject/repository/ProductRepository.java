package com.sparta.msaminiproject.repository;

import com.sparta.msaminiproject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
