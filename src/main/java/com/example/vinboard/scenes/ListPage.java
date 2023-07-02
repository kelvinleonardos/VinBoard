package com.example.vinboard.scenes;

import com.example.vinboard.scenes.components.scroll.ClipScroll;
import com.example.vinboard.scenes.components.GroupOpt;
import com.example.vinboard.scenes.components.Header;
import com.example.vinboard.scenes.components.scroll.NotesScroll;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class ListPage {

    static VBox list;
    public static Scene getListPage(String choice) {

        list = new VBox();

        VBox list_page = new VBox(Header.getHeader(), list);

        ListChanger(choice);

        Scene scene = new Scene(list_page);

        return scene;

    }

    public static void ListChanger(String choice) {
        list.getChildren().clear();
        if (choice.equals("C")) {
            list.getChildren().addAll(
                    GroupOpt.getGroupOpt("C"),
                    ClipScroll.getClipScroll()
            );
        } else if (choice.equals("N")) {
            list.getChildren().addAll(
                    GroupOpt.getGroupOpt("N"),
                    NotesScroll.getNotesScroll()
            );
        }
    }

}
