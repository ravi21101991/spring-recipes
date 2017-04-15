package com.spring.recipe.product;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Product {

    private String name;
    private Double price;

}
