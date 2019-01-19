package com.practice.factory;

public class FrontEndEngineerTrainingCamp implements EngineerTrainingCamp {
    @Override
    public Engineer trainEngineer() {
        return new FrontEndEngineer();
    }
}
