package com.example.vinboard.config;

import java.sql.*;

public class DBConfig {

    private static final String DB_URL = "jdbc:sqlite:VinBoard.db";

    protected static Connection connection;
    protected static Statement statement;
    protected static PreparedStatement preparedStatement;
    protected static ResultSet resultSet;
    protected static String query;

    protected static void connection() {
        try {
            connection = DriverManager.getConnection(DB_URL);
            System.out.println("DB connection established");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
