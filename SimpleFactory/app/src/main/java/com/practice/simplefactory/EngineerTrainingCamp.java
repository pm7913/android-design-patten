package com.practice.simplefactory;

public class EngineerTrainingCamp {
    public static Engineer trainingEngineer(String type) {
        switch (type) {
            case SotftEngineer.TYPE:
                return new SotftEngineer();
            case FrontEndEngineer.TYPE:
                return new FrontEndEngineer();
            default:
                return null;
        }
    }
}
