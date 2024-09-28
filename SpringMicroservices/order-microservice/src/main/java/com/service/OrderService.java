package com.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.client.ProductServiceClient;
import com.entiry.Order;
import com.repositoru.OrderRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final RestTemplate restTemplate;
    private final ProductServiceClient productClient;

    public OrderService(OrderRepository orderRepository, RestTemplate restTemplate, ProductServiceClient productClient) {
        this.orderRepository = orderRepository;
        this.restTemplate = restTemplate;
        this.productClient = productClient;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public Order createOrder(Order order) {
        String userUrl = "http://userservice/users/" + order.getUserId();
        String productUrl = "http://productservice/products/" + order.getProductId();

        // Validate User
        if (restTemplate.getForObject(userUrl, Object.class) == null) {
            throw new RuntimeException("User not found");
        }
		return order;
    }
}

