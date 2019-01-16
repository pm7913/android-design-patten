package com.practice.abstractdocument;


import com.practice.abstractdocument.interfaces.HasBrand;
import com.practice.abstractdocument.interfaces.HasPrice;
import com.practice.abstractdocument.interfaces.HasType;

import java.util.Map;

public class Part extends BaseDocument implements HasBrand, HasPrice, HasType {
    public Part(Map<String, Object> dress) {
        super(dress);
    }

    @Override
    public String toString() {
        return getType() + ",  brand: " + getBrand() + ",  price: " + getPrice();
    }
}
