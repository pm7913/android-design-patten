package com.practice.simplefactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StringBuilder builder = new StringBuilder();
        Engineer softEngineer = EngineerTrainingCamp.trainingEngineer(SotftEngineer.TYPE);
        builder.append("I am ");
        builder.append(softEngineer.getType());
        builder.append("\n");

        Engineer frontEndEngineer = EngineerTrainingCamp.trainingEngineer(FrontEndEngineer.TYPE);
        frontEndEngineer.getType();
        builder.append("I am ");
        builder.append(frontEndEngineer.getType());
        builder.append("\n");

        TextView textView = findViewById(R.id.message);
        textView.setText(builder.toString());

        
    }
}
