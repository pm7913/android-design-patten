package com.practice.abstractdocument.interfaces;


import com.practice.abstractdocument.Part;

import java.util.List;

public interface HasParts extends Document {
    String PROPERTY = "parts";

//    default Stream<Part> getParts() {
//        return children(PROPERTY, Part::new);
//    }
    default List<Part> getParts() {
        return children(PROPERTY);
    }
}
