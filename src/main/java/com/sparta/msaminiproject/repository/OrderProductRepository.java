package com.sparta.msaminiproject.repository;

import com.sparta.msaminiproject.entity.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {
}
