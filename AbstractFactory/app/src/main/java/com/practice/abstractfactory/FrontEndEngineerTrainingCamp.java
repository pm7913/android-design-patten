package com.practice.abstractfactory;

import com.practice.abstractfactory.skill.EquipmentFactory;
import com.practice.abstractfactory.skill.FrontEndEngineerEquipmentFactory;
import com.practice.abstractfactory.skill.FrontEndEngineerSkillFactory;
import com.practice.abstractfactory.skill.SkillFactory;

public class FrontEndEngineerTrainingCamp implements EngineerTrainingCamp {
    private EquipmentFactory mEquipmentFactory = new FrontEndEngineerEquipmentFactory();
    private SkillFactory mSkillFactory = new FrontEndEngineerSkillFactory();

    @Override
    public Engineer trainEngineer() {
        Engineer engineer = new FrontEndEngineer();
        engineer.setDevice(mEquipmentFactory.buyDevice());
        engineer.setSkill(mSkillFactory.learnSkill());
        return engineer;
    }
}
