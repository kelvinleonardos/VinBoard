package com.example.vinboard.scenes.components;

import com.example.vinboard.utils.Const;
import javafx.scene.control.ScrollPane;

public class NotesScroll {

    public static ScrollPane getNotesScroll() {

        ScrollPane notes_scroll = new ScrollPane();
        notes_scroll.setPrefSize(Const.NOTES_SCROLL_WIDTH, Const.NOTES_SCROLL_HEIGHT);
        notes_scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        return notes_scroll;

    }

}
