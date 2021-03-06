/*
 * This file is generated by jOOQ.
 */
package com.lernapi.myapp.db.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * Товар
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Products implements Serializable {

    private static final long serialVersionUID = 1809142277;

    private BigDecimal productsId;
    private String     name;
    private String     description;
    private String     model;
    private BigInteger amount;
    private BigDecimal cost;

    public Products() {}

    public Products(Products value) {
        this.productsId = value.productsId;
        this.name = value.name;
        this.description = value.description;
        this.model = value.model;
        this.amount = value.amount;
        this.cost = value.cost;
    }

    public Products(
        BigDecimal productsId,
        String     name,
        String     description,
        String     model,
        BigInteger amount,
        BigDecimal cost
    ) {
        this.productsId = productsId;
        this.name = name;
        this.description = description;
        this.model = model;
        this.amount = amount;
        this.cost = cost;
    }

    public BigDecimal getProductsId() {
        return this.productsId;
    }

    public void setProductsId(BigDecimal productsId) {
        this.productsId = productsId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigInteger getAmount() {
        return this.amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }

    public BigDecimal getCost() {
        return this.cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Products (");

        sb.append(productsId);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(model);
        sb.append(", ").append(amount);
        sb.append(", ").append(cost);

        sb.append(")");
        return sb.toString();
    }
}
