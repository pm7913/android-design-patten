package com.practice.abstractfactory.skill;

public class FrontEndEngineerEquipmentFactory implements EquipmentFactory {
    @Override
    public Device buyDevice() {
        return new Apple();
    }
}
