package com.example.vinboard.scenes.components;

import com.example.vinboard.utils.Const;
import javafx.scene.control.ScrollPane;

public class ClipScroll {

    public static ScrollPane getClipScroll() {

        ScrollPane clip_scroll = new ScrollPane();
        clip_scroll.setPrefSize(Const.CLIP_SCROLL_WIDTH, Const.CLIP_SCROLL_HEIGHT);
        clip_scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        return clip_scroll;

    }

}
