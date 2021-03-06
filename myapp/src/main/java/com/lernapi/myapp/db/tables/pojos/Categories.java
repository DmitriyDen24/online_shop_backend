/*
 * This file is generated by jOOQ.
 */
package com.lernapi.myapp.db.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Categories implements Serializable {

    private static final long serialVersionUID = -645862454;

    private BigDecimal categoriesId;
    private String     name;

    public Categories() {}

    public Categories(Categories value) {
        this.categoriesId = value.categoriesId;
        this.name = value.name;
    }

    public Categories(
        BigDecimal categoriesId,
        String     name
    ) {
        this.categoriesId = categoriesId;
        this.name = name;
    }

    public BigDecimal getCategoriesId() {
        return this.categoriesId;
    }

    public void setCategoriesId(BigDecimal categoriesId) {
        this.categoriesId = categoriesId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Categories (");

        sb.append(categoriesId);
        sb.append(", ").append(name);

        sb.append(")");
        return sb.toString();
    }
}
