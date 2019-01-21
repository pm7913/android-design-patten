package com.practice.abstractfactory.skill;

import android.util.Log;

public abstract class Skill {
    private static final String TAG = Skill.class.getSimpleName();
    protected String skillName;

    /**
     * show skill
     */
    public String showSkill() {
        Log.d(TAG, " skill = " + skillName);
        return skillName;
    }

}
