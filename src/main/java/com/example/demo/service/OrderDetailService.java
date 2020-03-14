package com.example.demo.service;

import com.example.demo.model.OrderDetail;
import com.example.demo.model.Product;
import com.example.demo.repository.OrderDetailRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Transactional(readOnly = true)
@Service
public class OrderDetailService {

    private final OrderDetailRepository repository;
    private final EntityManager em;

    public OrderDetailService(OrderDetailRepository repository, EntityManager em) {
        this.repository = repository;
        this.em = em;
    }

    @Transactional
    public OrderDetail add(OrderDetail detail) {
        Product product = em.find(Product.class, detail.getProductId());
        detail.setPrice(product.getPrice());
        detail.setAmount(detail.getPrice() * detail.getQuantity());
        return repository.save(detail);
    }
}
