package com.practice.abstractfactory.skill;

public class SoftEngineerSkillFactory implements SkillFactory {
    @Override
    public Skill learnSkill() {
        return new Java();
    }
}
