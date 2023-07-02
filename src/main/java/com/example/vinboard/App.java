package com.example.vinboard;

import com.example.vinboard.scenes.ListPage;
import com.example.vinboard.utils.Const;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle(Const.APP_NAME);
        stage.setResizable(false);
        stage.setScene(ListPage.getClipList());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}