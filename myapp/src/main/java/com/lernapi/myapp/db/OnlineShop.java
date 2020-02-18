/*
 * This file is generated by jOOQ.
 */
package com.lernapi.myapp.db;


import com.lernapi.myapp.db.tables.Categories;
import com.lernapi.myapp.db.tables.Products;
import com.lernapi.myapp.db.tables.ProductsToCategories;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OnlineShop extends SchemaImpl {

    private static final long serialVersionUID = -2071310420;

    /**
     * The reference instance of <code>online_shop</code>
     */
    public static final OnlineShop ONLINE_SHOP = new OnlineShop();

    /**
     * The table <code>online_shop.categories</code>.
     */
    public final Categories CATEGORIES = Categories.CATEGORIES;

    /**
     * Товар
     */
    public final Products PRODUCTS = Products.PRODUCTS;

    /**
     * Товары в категориях
     */
    public final ProductsToCategories PRODUCTS_TO_CATEGORIES = ProductsToCategories.PRODUCTS_TO_CATEGORIES;

    /**
     * No further instances allowed
     */
    private OnlineShop() {
        super("online_shop", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Categories.CATEGORIES,
            Products.PRODUCTS,
            ProductsToCategories.PRODUCTS_TO_CATEGORIES);
    }
}