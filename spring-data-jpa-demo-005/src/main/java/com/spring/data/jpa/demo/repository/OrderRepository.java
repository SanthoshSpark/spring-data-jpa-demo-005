package com.spring.data.jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.data.jpa.demo.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	public Order findByOrderTrackingNumber(String orderTrackingNumber);
}
