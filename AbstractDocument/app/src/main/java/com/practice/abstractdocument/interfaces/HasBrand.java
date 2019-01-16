package com.practice.abstractdocument.interfaces;

import com.practice.abstractdocument.interfaces.Document;

import java.util.Map;

public interface HasBrand extends Document {
    String PROPERTY = "brand";

    default String getBrand() {
        return (String) get(PROPERTY);
    }
}
