package com.spring.data.jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.data.jpa.demo.model.OrderItem;


public interface OrederItemRepository extends JpaRepository<OrderItem, Long>{

}

