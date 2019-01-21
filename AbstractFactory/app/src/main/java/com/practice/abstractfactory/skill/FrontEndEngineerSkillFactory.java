package com.practice.abstractfactory.skill;

public class FrontEndEngineerSkillFactory implements SkillFactory {
    @Override
    public Skill learnSkill() {
        return new JavaScript();
    }
}
