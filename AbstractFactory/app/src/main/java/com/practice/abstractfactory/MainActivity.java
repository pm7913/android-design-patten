package com.practice.abstractfactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.message);
        EngineerTrainingCamp engineerTrainingCamp = new SoftEngineerTrainingCamp();
        Engineer softEngineer = engineerTrainingCamp.trainEngineer();

        engineerTrainingCamp = new FrontEndEngineerTrainingCamp();
        Engineer frontEngineer = engineerTrainingCamp.trainEngineer();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(softEngineer.display());
        stringBuilder.append("\n");

        stringBuilder.append(frontEngineer.display());

        textView.setText(stringBuilder.toString());
    }
}
