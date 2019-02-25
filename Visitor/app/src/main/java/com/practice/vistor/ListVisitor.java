package com.practice.vistor;

import android.util.Log;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private static final String TAG = ListVisitor.class.getSimpleName();
    private String mSpace = "";

    public ListVisitor() {
        Log.d(TAG, "print folder construct");
    }

    @Override
    public void visit(Folder folder) {
        Log.d(TAG, mSpace + folder.getFileName());
        mSpace += "  ";
        Iterator iterator = folder.getSubFiles();
        while (iterator.hasNext()) {
            Base base = (Base) iterator.next();
            base.accept(this);
        }
    }

    @Override
    public void visit(File file) {
        Log.d(TAG, mSpace + file.getFileName());
    }
}
