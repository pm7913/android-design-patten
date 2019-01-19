package com.practice.factory;

import android.util.Log;

public class SotftEngineer implements Engineer {
    private static final String TAG = SotftEngineer.class.getSimpleName();
    public static final String TYPE = "Soft Engineer";

    @Override
    public String getType() {
        Log.d(TAG, "I am " + TYPE);
        return TYPE;
    }
}
