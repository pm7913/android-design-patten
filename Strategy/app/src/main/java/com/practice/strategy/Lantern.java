package com.practice.strategy;

import android.util.Log;

public class Lantern extends Festival {
    private static final String TAG = Lantern.class.getSimpleName();
    private String mActivities;

    public Lantern() {
        this.mActivities = "提燈籠";
    }

    @Override
    public String activities() {
        Log.d(TAG, mActivities);
        return mActivities;
    }
}
