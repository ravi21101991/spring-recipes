package com.spring.recipes;

import com.spring.recipes.beans.Person;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/beans.xml"})
public class PersonTest {

    @Autowired
    private Person subject;

    @Test
    public void getPersonDetails_TestsInjectedPerson_ExpectsNonNullValues() {
        Person expected = new Person();
        expected.setFirstName("Ravi");
        expected.setLastName("Nair");
        expected.setAge(25);
        expected.setState("Gujarat");
        expected.setCountry("India");

        MatcherAssert.assertThat(subject, Matchers.is(expected));
    }
}