package com.example.demo.controllers;

import com.example.demo.model.Order;
import com.example.demo.model.OrderDetail;
import com.example.demo.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/order_details")
public class OrderDetailsController {

    private final OrderDetailService service;

    public OrderDetailsController(OrderDetailService service) {
        this.service = service;
    }

    @PostMapping(value = "/{orderId}", consumes = "application/json")
    public OrderDetail add(@PathVariable int orderId,@RequestBody String body) {
        JsonParser parser = JsonParserFactory.getJsonParser();
        Map<String, Object> map = parser.parseMap(body);
        OrderDetail detail = new OrderDetail();
        detail.setOrderId(orderId);
        detail.setProductId(Integer.parseInt((String)map.get("product_id")));
        detail.setQuantity(Double.parseDouble((String)map.get("quantity")));
        return service.add(detail);
    }
}
