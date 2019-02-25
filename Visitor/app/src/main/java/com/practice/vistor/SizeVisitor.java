package com.practice.vistor;

import java.util.Iterator;

public class SizeVisitor extends Visitor {
    private static final String TAG = SizeVisitor.class.getSimpleName();
    private int mSize;

    public int getSize() {
        return mSize;
    }

    @Override
    public void visit(Folder folder) {
        Iterator<Base> iterator = folder.getSubFiles();
        while (iterator.hasNext()) {
            Base base = (Base) iterator.next();
            base.accept(this);
        }
    }

    @Override
    public void visit(File file) {
        mSize += file.getSize();
    }
}
