package com.spring.recipe.product;

import lombok.Data;

@Data
public class Disc extends Product {

    private int rpm;

    public Disc(String name, Double price) {
        super(name, price);
    }
}