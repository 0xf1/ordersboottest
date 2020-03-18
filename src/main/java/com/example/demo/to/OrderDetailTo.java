package com.example.demo.to;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

public class OrderDetailTo {

    @NotNull(message = "provide product id")
    private Integer productId;

    @DecimalMin(value = "0.1", message = "quantity must by greater than 0")
    private double quantity;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
