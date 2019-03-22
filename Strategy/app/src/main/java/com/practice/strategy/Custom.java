package com.practice.strategy;

public class Custom {
    private static final String TAG = Custom.class.getSimpleName();
    private Festival mFestival;

    public Custom(String custom) {
        switch (custom) {
            case "Lantern":
                mFestival = new Lantern();
                break;
            case "TombSweeping":
                mFestival = new TombSweeping();
                break;
            case "DragonBoat":
                mFestival = new DragonBoat();
                break;
        }
    }

    public String showFestival() {
        return mFestival.activities();
    }
}
