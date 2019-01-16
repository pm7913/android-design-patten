package com.practice.abstractdocument.interfaces;

import com.practice.abstractdocument.interfaces.Document;

import java.util.Map;

public interface HasType extends Document {
    String PROPERTY = "type";

    default String getType() {
        return (String) get(PROPERTY);
    }
}
