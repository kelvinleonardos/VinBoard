package com.example.vinboard.scenes.components.scroll;

import com.example.vinboard.controller.ClipController;
import com.example.vinboard.scenes.components.box.ClipBox;
import com.example.vinboard.utils.Const;
import javafx.geometry.Pos;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class ClipScroll {

    public static ArrayList<ClipBox> cliped = new ArrayList<>();
    private static VBox clip_scroll_vbox = new VBox();
    public static ScrollPane getClipScroll() {

        clip_scroll_vbox.setPrefWidth(Const.CLIP_SCROLL_WIDTH);
        clip_scroll_vbox.setAlignment(Pos.TOP_CENTER);

        callContent();

        ScrollPane clip_scroll = new ScrollPane(clip_scroll_vbox);
        clip_scroll.setFitToWidth(true);
        clip_scroll.setPrefSize(Const.CLIP_SCROLL_WIDTH, Const.CLIP_SCROLL_HEIGHT);
        clip_scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        clip_scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        return clip_scroll;

    }

    public static void callContent() {
        clip_scroll_vbox.getChildren().clear();
        for (ArrayList<String> i : ClipController.getAll()) {
            int count = 0;
            int temp = -1;
            for (String j : i) {
                if (count == 0) {
                    temp = Integer.parseInt(j);
                }
                if (count > 0) {
                    ClipBox cb = new ClipBox(temp, j, true);
                    clip_scroll_vbox.getChildren().add(cb.getClipBox());
                }
                count++;
            }
            count = 0;
        }
        for (ClipBox k : cliped) {
            clip_scroll_vbox.getChildren().add(k.getClipBox());
        }
    }

    public static void addCliped(ClipBox clipbox) {

        cliped.add(clipbox);

    }

    public static void removeCliped(ClipBox clipbox) {

        cliped.remove(clipbox);

    }

}
