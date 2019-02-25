package com.practice.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Target classTarget = new ClassAdaptor();
        classTarget.request("class adapter");

        Target objectTarget = new ObjectAdapter(new Adaptor());
        objectTarget.request("object adapter");


    }
}
