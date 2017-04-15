package com.spring.recipe;

import com.spring.recipe.product.Battery;
import com.spring.recipe.product.Disc;
import com.spring.recipe.product.Product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Product battery = (Battery) applicationContext.getBean("battery");
        Product disc = (Disc) applicationContext.getBean("disc");

        System.out.println(battery.getName());
        System.out.println(disc.getName());
    }
}
