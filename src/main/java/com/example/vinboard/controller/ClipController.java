package com.example.vinboard.controller;

import com.example.vinboard.config.DBConfig;

import java.sql.SQLException;
import java.util.ArrayList;

public class ClipController extends DBConfig {

    public static void insertData(String content) {

        connection();

        query = "INSERT INTO tb_clips (content) VALUES (?)";

        try {
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, content);

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

    public static void main(String[] args) {
        for (ArrayList<String> r : getAll()) {
            System.out.print("{");
            for (String c : r) {
                System.out.print(c + " ");
            }
            System.out.println("}");
        }
    }

}
