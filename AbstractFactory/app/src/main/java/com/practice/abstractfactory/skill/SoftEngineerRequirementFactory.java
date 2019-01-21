package com.practice.abstractfactory.skill;

public class SoftEngineerRequirementFactory implements RequirementFactory {

    @Override
    public Device buyDevice() {
        return new MSI();
    }

    @Override
    public Skill learnSkill() {
        return new Java();
    }
}
