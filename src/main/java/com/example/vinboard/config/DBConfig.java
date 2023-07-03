package com.example.vinboard.config;

import java.sql.*;

public class DBConfig {

    private static final String DB_URL = "jdbc:sqlite:VinBoard.db";

    private static Connection connect;

    public static void connection() {
        try {
            connect = DriverManager.getConnection(DB_URL);
            System.out.println("DB connection established");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        connection();
    }

}
