package com.example.vinboard.scenes.components.scroll;

import com.example.vinboard.scenes.components.box.ClipBox;
import com.example.vinboard.utils.Const;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class ClipScroll {

    public static ScrollPane getClipScroll() {

        VBox clip_scroll_vbox = new VBox();
        clip_scroll_vbox.setPrefWidth(Const.CLIP_SCROLL_WIDTH);
        clip_scroll_vbox.setAlignment(Pos.TOP_CENTER);

        ScrollPane clip_scroll = new ScrollPane(clip_scroll_vbox);
        clip_scroll.setPrefSize(Const.CLIP_SCROLL_WIDTH, Const.CLIP_SCROLL_HEIGHT);
        clip_scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        return clip_scroll;

    }

}
