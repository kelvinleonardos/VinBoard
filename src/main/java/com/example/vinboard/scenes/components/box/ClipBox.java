package com.example.vinboard.scenes.components.box;

import com.example.vinboard.utils.Const;
import javafx.scene.control.Label;

public class ClipBox {

    private String content;

    public ClipBox(String content) {
        this.content = content;
    }

    public Label getClipBox() {

        Label clip_box = new Label(content);
        clip_box.setPrefSize(Const.CLIP_BOX_WIDTH, Const.CLIP_BOX_HEIGHT);
        clip_box.setWrapText(true);

        return clip_box;

    }

}
