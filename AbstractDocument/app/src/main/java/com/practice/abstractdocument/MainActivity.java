package com.practice.abstractdocument;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.practice.abstractdocument.interfaces.HasBrand;
import com.practice.abstractdocument.interfaces.HasParts;
import com.practice.abstractdocument.interfaces.HasPrice;
import com.practice.abstractdocument.interfaces.HasType;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView msgTxt = findViewById(R.id.message);
        Map<String, Object> humanBaseInfo = new HashMap<String, Object>();
        humanBaseInfo.put(Human.NAME, "Robert");
        humanBaseInfo.put(Human.AGE, 27);

        Map<String, Object> capInfo = new HashMap<String, Object>();
        capInfo.put(HasType.PROPERTY, "cap");
        capInfo.put(HasBrand.PROPERTY, "Timberland");
        capInfo.put(HasPrice.PROPERTY, 1200);

        Map<String, Object> clothesInfo = new HashMap<String, Object>();
        clothesInfo.put(HasType.PROPERTY, "clothes");
        clothesInfo.put(HasBrand.PROPERTY, "Roots");
        clothesInfo.put(HasPrice.PROPERTY, 980);

        Map<String, Object> pantsInfo = new HashMap<String, Object>();
        pantsInfo.put(HasType.PROPERTY, "pants");
        pantsInfo.put(HasBrand.PROPERTY, "Edwin");
        pantsInfo.put(HasPrice.PROPERTY, 3200);

        Map<String, Object> watchInfo = new HashMap<String, Object>();
        watchInfo.put(HasType.PROPERTY, "watch");
        watchInfo.put(HasBrand.PROPERTY, "Panerai");
        watchInfo.put(HasPrice.PROPERTY, 320000);

        humanBaseInfo.put(HasParts.PROPERTY, Arrays.asList(capInfo, clothesInfo, pantsInfo, watchInfo));

        Human human = new Human(humanBaseInfo);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("my name is ");
        stringBuilder.append(human.getName());
        stringBuilder.append("\n");

        stringBuilder.append("my age is ");
        stringBuilder.append(human.getAge());
        stringBuilder.append("\n");

        stringBuilder.append("dress info");
        stringBuilder.append("\n");

        for (Part part : human.getParts()) {
            stringBuilder.append(part.toString());
            stringBuilder.append("\n");
        }

        msgTxt.setText(stringBuilder.toString());
    }
}
