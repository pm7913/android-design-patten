package com.practice.vistor;

public class File extends Base {
    private String mName;
    private int mSize;

    public File(String name, int size) {
        this.mName = name;
        this.mSize = size;
    }

    @Override
    public String getFileName() {
        return mName;
    }

    @Override
    public int getSize() {
        return mSize;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
