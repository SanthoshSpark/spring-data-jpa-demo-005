package com.spring.data.jpa.demo;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.data.jpa.demo.model.Order;
import com.spring.data.jpa.demo.model.OrderItem;
import com.spring.data.jpa.demo.repository.OrderRepository;



@SpringBootTest
public class OneToManyUnidirectionalMappingTest {
	/*
    @Autowired
    private OrderRepository orderRepository;

    @Test
    void testSaveOrder(){

        // create Order object
        Order order = new Order();

        OrderItem orderItem = new OrderItem();
        
        orderItem.setImageUrl("image_url.png");
        orderItem.setPrice(new BigDecimal(100));
        // add orderitem to order
        order.add(orderItem);

        OrderItem orderItem2 = new OrderItem();
        orderItem2.setImageUrl("image_url.png");
        orderItem2.setPrice(new BigDecimal(200));
        // add orderItem2 to order
        order.add(orderItem2);

        order.setOrderTrackingNumber("1000");
        order.setStatus("IN PROGRESS");
        // total amount of the order
        order.setTotalPrice(order.getTotalAmount());

        // Quantity of the order items
        order.setTotalQuantity(2);

        orderRepository.save(order);
        
        System.out.println("\n\n1. Inserted the row.......\n");

    }

    
    @Test
    void testUpdateOrder(){
    	System.out.println("\n\n2. Updated the row.......\n");
        Order order = orderRepository.findById(1L).get();
        System.out.println(order);
        order.setStatus("DELIVERED");
        orderRepository.save(order);
       
    }
	
    
    @Test
    void testGetAllOrders(){

        List<Order> orders = orderRepository.findAll();
        
        System.out.println("\n\n3. Selecting the rows.......\n");

        orders.forEach((o) -> {

            System.out.println("order id :: " + o.getId());

            o.getOrderItems().forEach((orderItem -> {
                System.out.println("orderItem :: " + orderItem.getId());
            }));
        });
    }
    
    
    @Test
    void testFindByOrderTrackingNumber(){

        Order order = orderRepository.findByOrderTrackingNumber("1000");
        
        System.out.println("\n\n4. Selecting the row.......\n");
        System.out.println(order);

        // add fetch type as EAGER
//        order.getOrderItems().forEach((o) -> {
//            System.out.println(o.getId());
//        });
    }

    @Test
    void testDeleteOrder(){
    	System.out.println("\n\n5. Deleted the row.......\n");
        orderRepository.deleteById(1L);
    }
    */
}
