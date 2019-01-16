package com.practice.abstractdocument;

import com.practice.abstractdocument.interfaces.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class BaseDocument implements Document {
    private Map<String, Object> mDress;

    public BaseDocument(Map<String, Object> dress) {
        this.mDress = dress;
    }

    @Override
    public void set(String key, Object value) {
        mDress.put(key, value);

    }

    @Override
    public Object get(String key) {
        return mDress.get(key);
    }

    @Override
    public List<Part> children(String key) {
        List<Part> parts = new ArrayList<>();
        for (Map<String, Object> map : (List<Map<String, Object>>) mDress.get(key)) {
            parts.add(new Part(map));
        }
        return parts;
    }

//    @Override
//    public <T> Stream<T> children(String key, Function<Map<String, Object>, T> construction) {
//        List<Map<String, Object>> child = (List<Map<String, Object>>) mClothing.get(key);
//        return child == null ? Stream.empty() : child.stream().map(construction);
//    }

}
