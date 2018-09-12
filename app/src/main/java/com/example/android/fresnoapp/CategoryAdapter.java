package com.example.android.fresnoapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    /* creates a new category adapter object
     *@param context is the context of this app
     *@param fm is the fragment manager that controls the state of the fragments **/

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // Tells which fragment holds what position in the tabLayout
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AroundTownFragment();
        } else if (position == 1) {
            return new DayTripFragment();
        } else if (position == 2) {
            return new FarmFreshFragment();
        } else {
            return new EntertainmentFragment();
        }
    }

    // establishes number of fragments
    @Override
    public int getCount() {
        return 4;
    }

    // sets title of fragment tabs
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.around_town);
        } else if (position == 1) {
            return mContext.getString(R.string.day_trips);
        } else if (position == 2) {
            return mContext.getString(R.string.farm_fresh);
        } else {
            return mContext.getString(R.string.entertainment);
        }
    }
}

