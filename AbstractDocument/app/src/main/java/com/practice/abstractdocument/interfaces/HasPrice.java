package com.practice.abstractdocument.interfaces;

public interface HasPrice extends Document {
    String PROPERTY = "price";

    default Integer getPrice() {
        return (Integer) get(PROPERTY);
    }
}
