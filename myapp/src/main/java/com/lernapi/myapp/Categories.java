package com.lernapi.myapp;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.math.BigDecimal;
import java.sql.*;

import static com.lernapi.myapp.db.tables.Categories.CATEGORIES;

public class Categories {
    ConnectionToDB conn;
    private final String user = "online_shop";
    private final String pass = "online_shop";
    private String url = "jdbc:postgresql://localhost:5432/online_shop";

    public String setCategories(String name) throws Exception {
        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            DSLContext create = DSL.using(conn, SQLDialect.POSTGRES);
            create.insertInto(CATEGORIES)
                    .set(CATEGORIES.CATEGORIES_ID, new BigDecimal(2))
                    .set(CATEGORIES.NAME, name)
                    .execute();
            conn.close();
            return "Category added!";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Category added failure";
    }

    public com.lernapi.myapp.db.tables.pojos.Categories getCategories(Integer id) {
        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            DSLContext create = DSL.using(conn, SQLDialect.POSTGRES);
            com.lernapi.myapp.db.tables.pojos.Categories category = create.select().from(CATEGORIES)
                    .where(CATEGORIES.CATEGORIES_ID.eq(BigDecimal.valueOf(id)))
                    .fetchAny().into(com.lernapi.myapp.db.tables.pojos.Categories.class);
            return category;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
