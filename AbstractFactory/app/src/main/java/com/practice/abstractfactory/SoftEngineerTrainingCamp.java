package com.practice.abstractfactory;

import com.practice.abstractfactory.skill.EquipmentFactory;
import com.practice.abstractfactory.skill.SkillFactory;
import com.practice.abstractfactory.skill.SoftEngineerEquipmentFactory;
import com.practice.abstractfactory.skill.SoftEngineerSkillFactory;

public class SoftEngineerTrainingCamp implements EngineerTrainingCamp {
    private EquipmentFactory mEquipmentFactory = new SoftEngineerEquipmentFactory();
    private SkillFactory mSkillFactory = new SoftEngineerSkillFactory();

    @Override
    public Engineer trainEngineer() {
        SoftEngineer softEngineer = new SoftEngineer();
        softEngineer.setSkill(mSkillFactory.learnSkill());
        softEngineer.setDevice(mEquipmentFactory.buyDevice());
        return softEngineer;
    }
}
