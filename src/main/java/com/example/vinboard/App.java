package com.example.vinboard;

import com.example.vinboard.scenes.ClipList;
import com.example.vinboard.utils.Const;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle(Const.APP_NAME);
        stage.setScene(ClipList.getClipList());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}