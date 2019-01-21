package com.practice.abstractfactory;

import android.util.Log;

public class FrontEndEngineer extends Engineer {
    private static final String TAG = FrontEndEngineer.class.getSimpleName();
    public static final String TYPE = "Front-end Engineer";

    @Override
    String display() {
        String msg = "I am " + TYPE + " my skills are " + getSkill().showSkill() + "\n"
                + " my device is " + getDevice().showDevice()+ "\n";
        Log.d(TAG, msg);
        return msg;
    }
}
