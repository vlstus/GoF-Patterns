package org.study.structural.composite.products.containers;

import org.study.structural.composite.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
Composite
* */
public class Box
        implements Product {

    private final List<Product> containedProducts = new ArrayList<>();

    public void add(Product product) {
        containedProducts.add(product);
    }

    public void add(List<Product> products) {
        containedProducts.addAll(products);
    }

    @Override
    public BigDecimal getPrice() {
        return containedProducts.stream()
                .map(Product::getPrice)
                .reduce(BigDecimal::add)
                .orElseThrow();
    }

}
