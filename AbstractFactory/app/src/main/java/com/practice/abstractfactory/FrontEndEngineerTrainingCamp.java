package com.practice.abstractfactory;

import com.practice.abstractfactory.skill.RequirementFactory;
import com.practice.abstractfactory.skill.FrontEndEngineerRequirementFactory;

public class FrontEndEngineerTrainingCamp implements EngineerTrainingCamp {
    private RequirementFactory mRequirementFactory = new FrontEndEngineerRequirementFactory();

    @Override
    public Engineer trainEngineer() {
        Engineer engineer = new FrontEndEngineer();
        engineer.setDevice(mRequirementFactory.buyDevice());
        engineer.setSkill(mRequirementFactory.learnSkill());
        return engineer;
    }
}
