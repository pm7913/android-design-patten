package com.practice.adapter;

public class ObjectAdapter implements Target {
    private Adaptor mAdapter;

    public ObjectAdapter(Adaptor adapter) {
        this.mAdapter = adapter;
    }

    @Override
    public void request(String msg) {
        mAdapter.specificRequest(msg);
    }
}
