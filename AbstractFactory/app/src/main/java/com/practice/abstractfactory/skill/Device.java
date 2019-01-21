package com.practice.abstractfactory.skill;

import android.util.Log;

public abstract class Device {
    private static final String TAG = Device.class.getSimpleName();
    protected String device;

    /**
     * show skill
     */
    public String showDevice() {
        Log.d(TAG, " device = " + device);
        return device;
    }

}
