package com.practice.vistor;

import java.util.Iterator;

public class PrintVisitor extends Visitor {
    private static final String TAG = PrintVisitor.class.getSimpleName();
    private StringBuilder mStringBuilder;
    private String mSpace = "";

    public PrintVisitor() {
        this.mStringBuilder = new StringBuilder();
    }

    public String getMessage() {
        return mStringBuilder.toString();
    }

    @Override
    public void visit(Folder folder) {
        mStringBuilder.append(mSpace + folder.getFileName());
        mStringBuilder.append("\n");
        mSpace += "     ";
        Iterator<Base> iterator = folder.getSubFiles();
        while (iterator.hasNext()) {
            Base base = (Base) iterator.next();
            base.accept(this);
        }
    }

    @Override
    public void visit(File file) {
        mStringBuilder.append(mSpace + file.getFileName());
        mStringBuilder.append("\n");
    }
}
