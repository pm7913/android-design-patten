package com.practice.strategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Custom custom = new Custom("Lantern");
        custom.showFestival();

        custom = new Custom("TombSweeping");
        custom.showFestival();

        custom = new Custom("DragonBoat");
        custom.showFestival();
    }
}
