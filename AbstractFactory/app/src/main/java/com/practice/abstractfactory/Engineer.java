package com.practice.abstractfactory;

import com.practice.abstractfactory.skill.Device;
import com.practice.abstractfactory.skill.Skill;

public abstract class Engineer {
    protected Skill mSkill;
    protected Device mDevice;

    public void setSkill(Skill skill) {
        this.mSkill = skill;
    }

    public void setDevice(Device device) {
        this.mDevice = device;
    }

    public Skill getSkill() {
        return mSkill;
    }

    public Device getDevice() {
        return mDevice;
    }

    abstract String display();
}
