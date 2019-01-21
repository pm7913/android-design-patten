package com.practice.abstractfactory;

import com.practice.abstractfactory.skill.RequirementFactory;
import com.practice.abstractfactory.skill.SoftEngineerRequirementFactory;

public class SoftEngineerTrainingCamp implements EngineerTrainingCamp {
    private RequirementFactory mRequirementFactory = new SoftEngineerRequirementFactory();

    @Override
    public Engineer trainEngineer() {
        SoftEngineer softEngineer = new SoftEngineer();
        softEngineer.setSkill(mRequirementFactory.learnSkill());
        softEngineer.setDevice(mRequirementFactory.buyDevice());
        return softEngineer;
    }
}
