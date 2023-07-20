package com.example.vinboard.scenes.components.scroll;

import com.example.vinboard.controller.ClipController;
import com.example.vinboard.scenes.components.box.ClipBox;
import com.example.vinboard.utils.Const;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class ClipScroll {

    public static ScrollPane getClipScroll() {

        VBox clip_scroll_vbox = new VBox();
        clip_scroll_vbox.setPrefWidth(Const.CLIP_SCROLL_WIDTH);
        clip_scroll_vbox.setAlignment(Pos.TOP_CENTER);

        for (ArrayList<String> i : ClipController.getAll()) {
            int count = 0;
            for (String j : i) {
                if (count > 0) {
                    ClipBox cb = new ClipBox(j);
                    clip_scroll_vbox.getChildren().add(cb.getClipBox());
                }
                count++;
            }
            count = 0;
        }

        ScrollPane clip_scroll = new ScrollPane(clip_scroll_vbox);
        clip_scroll.setPrefSize(Const.CLIP_SCROLL_WIDTH, Const.CLIP_SCROLL_HEIGHT);
        clip_scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        return clip_scroll;

    }

}
