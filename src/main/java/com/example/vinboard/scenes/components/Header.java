package com.example.vinboard.scenes.components;

import com.example.vinboard.utils.Const;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class Header {

    public static StackPane getHeader() {

        Text app_name = new Text(Const.APP_NAME);

        StackPane header = new StackPane(app_name);
        header.setPrefSize(Const.HEADER_WIDTH, Const.HEADER_HEIGHT);
        header.setAlignment(Pos.CENTER_LEFT);

        return header;

    }

}
