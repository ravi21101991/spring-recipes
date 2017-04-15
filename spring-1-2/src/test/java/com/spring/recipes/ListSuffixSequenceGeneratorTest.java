package com.spring.recipes;

import com.spring.recipes.sequence.ListSuffixSequenceGenerator;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/beans.xml")
public class ListSuffixSequenceGeneratorTest {

    private @Autowired ListSuffixSequenceGenerator listSuffixSequenceGenerator;

    @Test
    public void getSequence_ReturnsSequenceWithProvidedListOfSuffix() {
        String result = listSuffixSequenceGenerator.getSequence();
        String expected = "100000-PID-PROJECT";

        MatcherAssert.assertThat(result, Matchers.is(expected));
    }
}
