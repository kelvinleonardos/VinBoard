package com.example.vinboard.controller;

import com.example.vinboard.config.DBConfig;

import java.sql.SQLException;

public class NotesController extends DBConfig {

    public static void insertData(String date_time, String title, String content) {

        connection();

        query = "INSERT INTO tb_notes (date_time, title, content) VALUES (?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, date_time);
            preparedStatement.setString(2, title);
            preparedStatement.setString(3, content);

            preparedStatement.executeUpdate();

            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        insertData("17-05-04", "kelvin", "Hello, World!");
    }

}
