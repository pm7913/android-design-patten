package com.practice.vistor;

public abstract class Visitor {
    public abstract void visit(Folder folder);
    public abstract void visit(File file);
}
