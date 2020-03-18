package com.example.demo.to;

import com.fasterxml.jackson.annotation.JsonAlias;

import javax.validation.constraints.NotNull;

public class OrderTo {

    @NotNull
    private Integer customerId;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
