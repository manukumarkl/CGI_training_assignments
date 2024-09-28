package com.repositoru;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entiry.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
