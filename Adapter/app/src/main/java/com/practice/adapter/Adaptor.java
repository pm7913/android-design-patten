package com.practice.adapter;

import android.util.Log;

public class Adaptor {
    private static final String TAG = Adaptor.class.getSimpleName();

    public void specificRequest(String msg) {
        Log.d(TAG, "I'm " + msg);
    }

}
