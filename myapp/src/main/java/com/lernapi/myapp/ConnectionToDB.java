package com.lernapi.myapp;

import java.sql.*;


public class ConnectionToDB {

    private String userName;
    private String password;
    private String url = "jdbc:postgresql://localhost:5432/online_shop";

    public ConnectionToDB(String user, String pass) {
        userName = user;
        password = pass;
    }

    public Connection getConnection() throws Exception {
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean connectionClose(Connection conn) {
        try {
            conn.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
