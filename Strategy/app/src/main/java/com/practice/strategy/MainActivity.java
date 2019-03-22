package com.practice.strategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String mMessage = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.message);


        Custom custom = new Custom("Lantern");
        mMessage += custom.showFestival();
        mMessage = mMessage + "\n";
        custom = new Custom("TombSweeping");
        mMessage += custom.showFestival();
        mMessage = mMessage + "\n";

        custom = new Custom("DragonBoat");
        mMessage += custom.showFestival();
        mMessage = mMessage + "\n";

        textView.setText(mMessage);
    }
}
