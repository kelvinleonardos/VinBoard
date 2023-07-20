package com.example.vinboard.controller;

import com.example.vinboard.config.DBConfig;

import java.sql.SQLException;
import java.util.ArrayList;

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

    public static ArrayList<ArrayList<String>> getAll() {

        connection();

        ArrayList<ArrayList<String>> result = new ArrayList<>();

        query = "SELECT * FROM tb_notes";

        try {
            statement = connection.createStatement();

            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                ArrayList<String> row = new ArrayList<>();
                for (int i = 1; i <= 4; i++) {
                    row.add(resultSet.getString(i));
                }
                result.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;

    }

    public static void updateData(String id, String date_time, String title, String content) {

        connection();

        query = "";


    }

    public static void main(String[] args) {
        insertData("17-05-04", "kelvin", "Hello, World!");
    }

}
