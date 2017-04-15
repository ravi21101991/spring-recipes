package com.spring.recipes;

import com.spring.recipes.sequence.ListSuffixSequenceGenerator;
import com.spring.recipes.sequence.SequenceGenerator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application1_2 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SequenceGenerator sequenceGenerator = (SequenceGenerator) context.getBean("sequenceGenerator");
        System.out.println(sequenceGenerator.getSequence());

        ListSuffixSequenceGenerator listSuffixSequenceGenerator =
                (ListSuffixSequenceGenerator) context.getBean("listSuffixSequenceGenerator");
        System.out.println(listSuffixSequenceGenerator.getSequence());
    }
}