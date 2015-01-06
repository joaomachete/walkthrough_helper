/*
 * Copyright (c) 2014 SainsBurys Entertainment. Printed in Uk. All Rights Reserved. The copyright to the software program(s) is property of SainsBurys Entertainment. The program(s) may be used and or copied only with the express written consent of AloALo Ltd or in accordance with the terms and conditions stipulated in the agreement/contract under which the program(s) have been supplied.
 */

package com.sainsburys.walkthrough.fragments;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sainsburys.walkthrough.R;
import com.sainsburys.walkthrough.model.ScreenEnum;

/**
 * Created by machete on 15/12/14.
 */
public class WalkthroughFragment extends Fragment {

    public static final String ARG_SCREEN_INDEX = "param_screen_index";

    public int mParamImage;
    public int mParamIcon;
    public String mParamTitle;

    private ScreenEnum model;

    public WalkthroughFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param screen_index Index
     * @return A new instance of fragment WalkthroughFragment.
     */
    public static WalkthroughFragment newInstance(int screen_index) {
        WalkthroughFragment fragment = new WalkthroughFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SCREEN_INDEX, screen_index);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Resources res = getResources();

        if (getArguments() != null) {
            switch (getArguments().getInt(ARG_SCREEN_INDEX)) {
                case 0:
                    model = ScreenEnum.SCREEN1;
                    break;
                case 1:
                    model = ScreenEnum.SCREEN2;
                    break;
                case 2:
                    model = ScreenEnum.SCREEN3;
                    break;
            }

            mParamImage = model.image;
            mParamIcon = model.icon;
            mParamTitle = res.getString(model.text);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_walkthrough, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ((ImageView) view.findViewById(R.id.imageView)).setImageResource(mParamImage);
        ((ImageView) view.findViewById(R.id.imageViewIcon)).setImageResource(mParamIcon);
        ((TextView) view.findViewById(R.id.textviewLabel)).setText(mParamTitle);

    }
}
