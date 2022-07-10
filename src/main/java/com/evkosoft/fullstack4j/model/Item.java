package com.evkosoft.fullstack4j.model;

import java.math.BigDecimal;
import java.util.UUID;

public class Item {

    private UUID id;
    private String name;
    private String description;
    private BigDecimal price;

    public Item() {}

    public Item(String name, String description, double price) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.price = BigDecimal.valueOf(price);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
