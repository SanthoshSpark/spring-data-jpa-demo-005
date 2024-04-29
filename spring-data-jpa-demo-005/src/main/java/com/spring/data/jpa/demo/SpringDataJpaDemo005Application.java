package com.spring.data.jpa.demo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.data.jpa.demo.model.Order;
import com.spring.data.jpa.demo.model.OrderItem;
import com.spring.data.jpa.demo.repository.OrderRepository;

@SpringBootApplication
public class SpringDataJpaDemo005Application implements CommandLineRunner {

	@Autowired
	private OrderRepository orderRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaDemo005Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		System.out.println("\n\n1. Inserted the row.......\n");
		
		// create Order object
        Order order = new Order();

        OrderItem orderItem1 = new OrderItem();
        
        orderItem1.setImageUrl("image_url1.png");
        orderItem1.setPrice(new BigDecimal(100));
        // add orderitem to order
        order.add(orderItem1);

        OrderItem orderItem2 = new OrderItem();
        orderItem2.setImageUrl("image_url2.png");
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
        */
        
        //2. Updated the row.
        
		/*
		System.out.println("\n\n2. Updated the row.......\n");
        
		Order order1 = orderRepository.findById(1L).get();
        System.out.println(order1);
        order1.setStatus("DELIVERED");
        orderRepository.save(order1);
        
		*/
        
        //3. testGetAllOrders
        
        
        /*List<Order> orders = orderRepository.findAll();
        
        System.out.println("\n\n3. Selecting the rows.......\n");
        
        for(Order ord:orders) {
        	//System.out.println("order id :: " + ord.getId());
        	System.out.println("order :: " + ord);
        	for(OrderItem ordItm:ord.getOrderItems()) {
        		//System.out.println("OrderItem: " + ordItm.getId());
        		System.out.println("OrderItem: " + ordItm);
        	}
        }
        */
        
        
		/*
        List<Order> orders = orderRepository.findAll();
        
        System.out.println("\n\n3. Selecting the rows.......\n");

        orders.forEach((o) -> {

            System.out.println("order id :: " + o.getId());

            o.getOrderItems().forEach((orderItem1 -> {
                System.out.println("orderItem :: " + orderItem1.getId());
            }));
        });
		*/
		
        
        
        //4. 
		/*
        Order order2 = orderRepository.findByOrderTrackingNumber("1000");
        
        
        System.out.println("\n\n4. Selecting the row.......\n");
        if(order2 != null)
        	System.out.println(order2);
        else
        	System.out.println("There is no speicified order.");
        */
        
        
        //5. 
        System.out.println("\n\n5. Deleted the row.......\n");
        orderRepository.deleteById(1L);
        
	}

}
