package com.damera.rest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.damera.entity.Order;
import com.damera.repo.OrderRepository;

@RestController
@RequestMapping("/orders")
public class OrdersRestController {
	
	@Autowired
	private OrderRepository orderRepository;

    @PostConstruct
    public void initOrdersTable() {
        orderRepository.saveAll(Stream.of(
                        new Order("mobile", "electronics", "white", 20000.0),
                        new Order("T-Shirt", "clothes", "black", 999.0),
                        new Order("Jeans", "clothes", "blue", 1999.0),
                        new Order("Laptop", "electronics", "gray", 50000.0),
                        new Order("digital watch", "electronics", "black", 2500.0),
                        new Order("Fan", "electronics", "black", 50000.0)
                ).
                collect(Collectors.toList()));
    }

	@GetMapping
	public List<Order> getOrders(){
		return orderRepository.findAll();
	}
	@GetMapping("/{category}")
	public List<Order> getOrdersByCategory(@PathVariable String category){
		return orderRepository.findByCategory(category);
	}

}
