package com.example.demo.controllers;

import com.example.demo.model.OrderDetail;
import com.example.demo.service.OrderDetailService;
import com.example.demo.to.OrderDetailTo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/order_details")
public class OrderDetailsController {

    private final OrderDetailService service;

    public OrderDetailsController(OrderDetailService service) {
        this.service = service;
    }

    @PostMapping(value = "/{orderId}", consumes = "application/json")
    public OrderDetail add2(@PathVariable int orderId, @Validated @Valid @RequestBody OrderDetailTo orderDetailTo) {
        return service.add(orderId, orderDetailTo);
    }
}
