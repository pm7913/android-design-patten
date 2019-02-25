package com.practice.vistor;

import java.util.ArrayList;
import java.util.Iterator;

public class Folder extends Base {
    private String mName;
    private ArrayList<Base> mList;

    public Folder(String name) {
        this.mName = name;
        this.mList = new ArrayList<Base>();
    }

    @Override
    public String getFileName() {
        return mName;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator iterator = mList.iterator();
        while (iterator.hasNext()) {
            Base base = (Base) iterator.next();
            size += base.getSize();

        }
        return size;
    }

    public void add(Base base) {
        mList.add(base);
    }

    public Iterator getSubFiles() {
        return mList.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
