package com.practice.vistor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView message = findViewById(R.id.message);

        Folder root = new Folder("Root");
        root.add(new File("File1", 10));
        root.add(new File("File2", 23));

        Folder subFolder = new Folder("Sub folder");
        root.add(subFolder);

        subFolder.add(new File("File3", 45));
        subFolder.add(new File("File4", 46));

        Folder sub2Folder = new Folder("Sub 2 folder");
        subFolder.add(sub2Folder);

        sub2Folder.add(new File("File5", 105));
        sub2Folder.add(new File("File6", 86));

        root.accept(new ListVisitor());

        SizeVisitor sizeVisitor = new SizeVisitor();
        root.accept(sizeVisitor);
        Log.d(TAG, "Root size " + sizeVisitor.getSize()+"MB");

        PrintVisitor printVisitor = new PrintVisitor();
        root.accept(printVisitor);
        message.setText(printVisitor.getMessage());
    }
}
