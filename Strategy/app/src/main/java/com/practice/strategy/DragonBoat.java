package com.practice.strategy;

import android.util.Log;

public class DragonBoat extends Festival {
    private static final String TAG = DragonBoat.class.getSimpleName();
    private String mActivities;

    public DragonBoat() {
        this.mActivities = "提燈籠";
    }

    @Override
    public String activities() {
        Log.d(TAG, "mActivities");
        return mActivities;
    }
}
