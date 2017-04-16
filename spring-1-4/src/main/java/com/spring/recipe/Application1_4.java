package com.spring.recipe;

import com.spring.recipe.sequence.SequenceGenerator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application1_4 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SequenceGenerator sequenceGenerator = (SequenceGenerator) context.getBean("sequenceGenerator");
        System.out.println(sequenceGenerator.getNextSequence());
    }
}