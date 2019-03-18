package com.practice.strategy;

import android.util.Log;

public class Lantern extends Festival {
    private static final String TAG = Lantern.class.getSimpleName();
    @Override
    public void activities() {
        Log.d(TAG,"提燈籠");
    }
}
