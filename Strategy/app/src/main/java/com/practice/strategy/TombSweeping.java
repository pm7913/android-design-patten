package com.practice.strategy;

import android.util.Log;

public class TombSweeping extends Festival {
    private static final String TAG = TombSweeping.class.getSimpleName();
    @Override
    public void activities() {
        Log.d(TAG,"掃墓");
    }
}
