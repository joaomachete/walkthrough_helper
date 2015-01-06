package com.sainsburys.walkthrough.model;

import com.sainsburys.walkthrough.R;

/**
 * Created by machete on 19/12/14.
 */
public enum ScreenEnum {

    SCREEN1(0, R.drawable.longpress, R.drawable.longpress_icon, R.string.walkthrough_text1),
    SCREEN2(1, R.drawable.swipe, R.drawable.swipe_icon, R.string.walkthrough_text2),
    SCREEN3(2, R.drawable.search, R.drawable.search_icon, R.string.walkthrough_text3);

    public int screen_index;
    public int image;
    public int icon;
    public int text;

    ScreenEnum(int screen_index, int image, int icon, int text) {

        this.screen_index = screen_index;
        this.image = image;
        this.icon = icon;
        this.text = text;
    }

}
