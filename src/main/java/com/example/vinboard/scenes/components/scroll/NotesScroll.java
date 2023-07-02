package com.example.vinboard.scenes.components.scroll;

import com.example.vinboard.utils.Const;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class NotesScroll {

    public static ScrollPane getNotesScroll() {

        VBox note_scroll_vbox = new VBox();
        note_scroll_vbox.setPrefWidth(Const.CLIP_SCROLL_WIDTH);
        note_scroll_vbox.setAlignment(Pos.TOP_CENTER);

        ScrollPane notes_scroll = new ScrollPane(note_scroll_vbox);
        notes_scroll.setPrefSize(Const.NOTES_SCROLL_WIDTH, Const.NOTES_SCROLL_HEIGHT);
        notes_scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        return notes_scroll;

    }

}
