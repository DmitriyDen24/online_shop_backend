/*
 * This file is generated by jOOQ.
 */
package com.lernapi.myapp.db.tables;


import com.lernapi.myapp.db.Keys;
import com.lernapi.myapp.db.OnlineShop;
import com.lernapi.myapp.db.tables.records.ProductsRecord;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Товар
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Products extends TableImpl<ProductsRecord> {

    private static final long serialVersionUID = -1030196090;

    /**
     * The reference instance of <code>online_shop.products</code>
     */
    public static final Products PRODUCTS = new Products();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductsRecord> getRecordType() {
        return ProductsRecord.class;
    }

    /**
     * The column <code>online_shop.products.products_id</code>.
     */
    public final TableField<ProductsRecord, BigDecimal> PRODUCTS_ID = createField(DSL.name("products_id"), org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>online_shop.products.name</code>. Наименование
     */
    public final TableField<ProductsRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(200), this, "Наименование");

    /**
     * The column <code>online_shop.products.description</code>. Описание
     */
    public final TableField<ProductsRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(200), this, "Описание");

    /**
     * The column <code>online_shop.products.model</code>. Модель
     */
    public final TableField<ProductsRecord, String> MODEL = createField(DSL.name("model"), org.jooq.impl.SQLDataType.VARCHAR(200), this, "Модель");

    /**
     * The column <code>online_shop.products.amount</code>. Кол-во
     */
    public final TableField<ProductsRecord, BigInteger> AMOUNT = createField(DSL.name("amount"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(200), this, "Кол-во");

    /**
     * The column <code>online_shop.products.cost</code>. Стоимость
     */
    public final TableField<ProductsRecord, BigDecimal> COST = createField(DSL.name("cost"), org.jooq.impl.SQLDataType.NUMERIC(200, 2), this, "Стоимость");

    /**
     * Create a <code>online_shop.products</code> table reference
     */
    public Products() {
        this(DSL.name("products"), null);
    }

    /**
     * Create an aliased <code>online_shop.products</code> table reference
     */
    public Products(String alias) {
        this(DSL.name(alias), PRODUCTS);
    }

    /**
     * Create an aliased <code>online_shop.products</code> table reference
     */
    public Products(Name alias) {
        this(alias, PRODUCTS);
    }

    private Products(Name alias, Table<ProductsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Products(Name alias, Table<ProductsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Товар"), TableOptions.table());
    }

    public <O extends Record> Products(Table<O> child, ForeignKey<O, ProductsRecord> key) {
        super(child, key, PRODUCTS);
    }

    @Override
    public Schema getSchema() {
        return OnlineShop.ONLINE_SHOP;
    }

    @Override
    public UniqueKey<ProductsRecord> getPrimaryKey() {
        return Keys.PRODUCTS_PK;
    }

    @Override
    public List<UniqueKey<ProductsRecord>> getKeys() {
        return Arrays.<UniqueKey<ProductsRecord>>asList(Keys.PRODUCTS_PK);
    }

    @Override
    public Products as(String alias) {
        return new Products(DSL.name(alias), this);
    }

    @Override
    public Products as(Name alias) {
        return new Products(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Products rename(String name) {
        return new Products(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Products rename(Name name) {
        return new Products(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<BigDecimal, String, String, String, BigInteger, BigDecimal> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}