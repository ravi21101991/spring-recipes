package com.spring.recipes.beans;

import lombok.Data;

@Data
public class Person {

    private String firstName;

    private String lastName;

    private Integer age;

    private String state;

    private String country;

    public String getPersonDetails() {
        return "Person Details \n" +
                "First name: " + firstName + "\n" +
                "Last name: " + lastName + "\n" +
                "Age: " + age + "\n" +
                "State: " + state + "\n" +
                "Country: " + country + "\n";
    }
}
