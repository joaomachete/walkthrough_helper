package com.sainsburys.walkthrough.model;

import com.sainsburys.walkthrough.R;

/**
 * Created by machete on 19/12/14.
 */
public enum ScreenEnum {

    SCREEN1(0, R.drawable.ic_launcher, R.drawable.ic_launcher, R.color.primary_dark, R.string.walkthrough_text1),
    SCREEN2(1, R.drawable.ic_launcher, R.drawable.ic_launcher, R.color.primary_dark, R.string.walkthrough_text2),
    SCREEN3(2, R.drawable.ic_launcher, R.drawable.ic_launcher, R.color.primary_dark, R.string.walkthrough_text3);

    public int screen_index;
    public int image;
    public int icon;
    public int color;
    public int text;

    ScreenEnum(int screen_index, int image, int icon, int color, int text) {

        this.screen_index = screen_index;
        this.image = image;
        this.icon = icon;
        this.color = color;
        this.text = text;
    }

}
