package com.sainsburys.walkthrough.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sainsburys.walkthrough.fragments.WalkthroughFragment;
import com.sainsburys.walkthrough.model.ScreenEnum;

/**
 * Created by machete on 19/12/14.
 */
public class WalkthroughPagerAdapter extends FragmentPagerAdapter {

    public WalkthroughPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return WalkthroughFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return ScreenEnum.values().length;
    }

}
