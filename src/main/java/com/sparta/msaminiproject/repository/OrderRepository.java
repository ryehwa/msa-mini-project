package com.sparta.msaminiproject.repository;

import com.sparta.msaminiproject.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
