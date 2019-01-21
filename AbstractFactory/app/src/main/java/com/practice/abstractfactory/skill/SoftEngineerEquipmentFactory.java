package com.practice.abstractfactory.skill;

public class SoftEngineerEquipmentFactory implements EquipmentFactory {

    @Override
    public Device buyDevice() {
        return new MSI();
    }
}
