package com.practice.strategy;

import android.util.Log;

public class TombSweeping extends Festival {
    private static final String TAG = TombSweeping.class.getSimpleName();
    private String mActivities;

    public TombSweeping() {
        mActivities = "掃墓";
    }

    @Override
    public String activities() {
        Log.d(TAG, mActivities);
        return mActivities;
    }
}
