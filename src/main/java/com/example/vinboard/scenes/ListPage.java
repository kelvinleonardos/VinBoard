package com.example.vinboard.scenes;

import com.example.vinboard.scenes.components.ClipScroll;
import com.example.vinboard.scenes.components.GroupOpt;
import com.example.vinboard.scenes.components.Header;
import com.example.vinboard.utils.Const;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class ListPage {

    public static Scene getClipList() {

        VBox clip_list = new VBox(
                Header.getHeader(),
                GroupOpt.getGroupOpt(Const.GROUP_CHOICE),
                ClipScroll.getClipScroll()
        );

        Scene scene = new Scene(clip_list);

        return scene;

    }

}
