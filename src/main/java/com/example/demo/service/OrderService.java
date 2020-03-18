package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import com.example.demo.to.OrderTo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Transactional(readOnly = true)
@Service
public class OrderService {
    final OrderRepository repository;
    EntityManager em;

    public OrderService(OrderRepository repository, EntityManager em) {
        this.repository = repository;
        this.em = em;
    }

    public Iterable<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Transactional
    public Order create(OrderTo orderTo) {
        Order order = new Order();
        order.setCustomer(em.find(Customer.class, orderTo.getCustomerId()));
        return repository.save(order);
    }
}
