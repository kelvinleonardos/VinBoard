package com.example.vinboard.scenes.components.box;

import com.example.vinboard.utils.Const;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class NoteBox {

    public VBox getNoteBox() {

        Label note_title = new Label();
        Label note_text = new Label();
        note_text.setWrapText(true);

        VBox note_box = new VBox(note_title, note_text);

        note_box.setPrefSize(Const.NOTE_BOX_WIDTH, Const.NOTE_BOX_HEIGHT);

        return note_box;

    }

}
