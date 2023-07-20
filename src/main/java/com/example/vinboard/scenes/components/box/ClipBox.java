package com.example.vinboard.scenes.components.box;

import com.example.vinboard.models.ClipContent;
import com.example.vinboard.utils.Const;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class ClipBox extends ClipContent {

    public ClipBox(String content, boolean isPinned) {
        super(content, isPinned);
    }

    public HBox getClipBox() {

        HBox clip_box = new HBox();
        clip_box.setAlignment(Pos.CENTER);

        Label clip_content = new Label(super.getContent());
        clip_content.setPrefSize(Const.CLIP_CONTENT_WIDTH, Const.CLIP_CONTENT_HEIGHT);
        clip_content.setWrapText(true);

        if (super.isPinned()) {
            ImageView pinned_icon = new ImageView(Const.PINNED_ICON);
            pinned_icon.setFitWidth(Const.CLIP_ICON_WIDTH);
            pinned_icon.setPreserveRatio(true);
            pinned_icon.setOnMouseClicked(event -> {
                System.out.println("clicked");
            });
            clip_box.getChildren().addAll(clip_content, pinned_icon);
        } else {
            ImageView unpinned_icon = new ImageView(Const.UNPINNED_ICON);
            unpinned_icon.setFitWidth(Const.CLIP_ICON_WIDTH);
            unpinned_icon.setPreserveRatio(true);
            clip_box.getChildren().addAll(clip_content, unpinned_icon);
        }

        return clip_box;

    }

}
