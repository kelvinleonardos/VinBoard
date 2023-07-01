package com.example.vinboard.scenes.components;

import com.example.vinboard.utils.Const;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class GroupOpt {

    public static HBox getGroupOpt(String choice) {

        Separator bold = new Separator();
        bold.setPrefSize(Const.GROUP_CHOICE_LABEL_WIDTH, 10);

        StackPane bold_sep = new StackPane(bold);
        bold_sep.setAlignment(Pos.BOTTOM_CENTER);
        bold_sep.setPrefSize(Const.GROUP_CHOICE_LABEL_WIDTH, 10);

        Separator light = new Separator();
        light.setPrefSize(Const.GROUP_CHOICE_LABEL_WIDTH, 2);

        StackPane light_sep = new StackPane(light);
        light_sep.setAlignment(Pos.BOTTOM_CENTER);
        light_sep.setPrefSize(Const.GROUP_CHOICE_LABEL_WIDTH, 10);

        Label c_choice = new Label(Const.GROUP_CHOICE_C);
        c_choice.setPrefSize(Const.GROUP_CHOICE_LABEL_WIDTH, Const.GROUP_CHOICE_LABEL_HEIGHT);
        c_choice.setAlignment(Pos.CENTER);

        Label n_choice = new Label(Const.GROUP_CHOICE_N);
        n_choice.setPrefSize(Const.GROUP_CHOICE_LABEL_WIDTH, Const.GROUP_CHOICE_LABEL_HEIGHT);
        n_choice.setAlignment(Pos.CENTER);

        VBox c_vbox = new VBox();
        VBox n_vbox = new VBox();

        Button c_but = new Button();
        Button n_but = new Button();

        if (choice.equals("C")) {
            c_vbox.getChildren().addAll(c_choice, bold_sep);
            n_vbox.getChildren().addAll(n_choice, light_sep);
        } else if (choice.equals("N")){
            c_vbox.getChildren().addAll(c_choice, light_sep);
            n_vbox.getChildren().addAll(n_choice, bold_sep);
        }

        c_but.setGraphic(c_vbox);
        n_but.setGraphic(n_vbox);

        HBox opt = new HBox(c_but, n_but);
        opt.setAlignment(Pos.CENTER);

        return opt;

    }

}
