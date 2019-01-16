package com.practice.abstractdocument;

import com.practice.abstractdocument.interfaces.HasBrand;
import com.practice.abstractdocument.interfaces.HasParts;
import com.practice.abstractdocument.interfaces.HasPrice;
import com.practice.abstractdocument.interfaces.HasType;

import java.util.Map;

public class Human extends BaseDocument implements HasType, HasBrand, HasPrice, HasParts {
    public static final String NAME = "name";
    public static final String AGE = "age";

    public Human(Map<String, Object> clothing) {
        super(clothing);
    }

    public Object getName() {
        return get(NAME);
    }

    public Object getAge() {
        return get(AGE);
    }
}
