package com.practice.factory;

public class SoftEngineerTrainingCamp implements EngineerTrainingCamp {
    @Override
    public Engineer trainEngineer() {
        return new SotftEngineer();
    }
}
