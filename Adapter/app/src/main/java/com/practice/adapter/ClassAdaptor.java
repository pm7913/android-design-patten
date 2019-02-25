package com.practice.adapter;

public class ClassAdaptor extends Adaptor implements Target {

    @Override
    public void request(String msg) {
        specificRequest(msg);
    }
}
