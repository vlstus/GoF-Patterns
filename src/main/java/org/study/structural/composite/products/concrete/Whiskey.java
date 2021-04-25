package org.study.structural.composite.products.concrete;

import org.study.structural.composite.Product;

import java.math.BigDecimal;

/*
Leaf
* */
public class Whiskey
        implements Product {

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("105.15");
    }

}
