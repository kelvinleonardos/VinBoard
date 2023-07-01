package com.example.vinboard;

import com.example.vinboard.utils.Const;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        StackPane h = new StackPane();
        Scene scene = new Scene(h, Const.APP_WINDOW_WIDTH, Const.APP_WINDOW_HEIGHT);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}