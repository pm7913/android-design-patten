package com.practice.factory;

import android.util.Log;

public class FrontEndEngineer implements Engineer {
    private static final String TAG = FrontEndEngineer.class.getSimpleName();
    public static final String TYPE = "Front-end Engineer";

    @Override
    public String getType() {
        Log.d(TAG, "I am " + TYPE);
        return TYPE;
    }
}
