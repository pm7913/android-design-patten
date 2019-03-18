package com.practice.strategy;

import android.util.Log;

public class DragonBoat extends Festival {
    private static final String TAG = DragonBoat.class.getSimpleName();

    @Override
    public void activities() {
        Log.d(TAG, "提燈籠");

    }
}
