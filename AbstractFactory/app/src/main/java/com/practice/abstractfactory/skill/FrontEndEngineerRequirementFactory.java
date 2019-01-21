package com.practice.abstractfactory.skill;

public class FrontEndEngineerRequirementFactory implements RequirementFactory {
    @Override
    public Device buyDevice() {
        return new Apple();
    }

    @Override
    public Skill learnSkill() {
        return new JavaScript();
    }
}
