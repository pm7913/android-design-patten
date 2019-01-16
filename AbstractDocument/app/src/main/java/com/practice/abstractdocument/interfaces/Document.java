package com.practice.abstractdocument.interfaces;

import com.practice.abstractdocument.Part;

import java.util.List;

public interface Document {
    void set(String key, Object value);

    Object get(String key);

    List<Part> children(String key);

//  <T> Stream<T> children(String key, Function<Map<String, Object>, T> construction);

}
