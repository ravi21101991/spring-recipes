package com.spring.recipes;

import com.spring.recipes.sequence.SequenceGenerator;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/beans.xml"})
public class SequenceGeneratorTest {

    @Autowired
    private SequenceGenerator sequenceGenerator;

    @Autowired
    private SequenceGenerator concurrentAccessTestSequenceGenerator;

    @Test
    public void getSequence_ReturnsNonNullSequenceNumber() {
        String result1 = sequenceGenerator.getSequence();
        String result2 = sequenceGenerator.getSequence();

        String expected1 = "RA10000PID";
        String expected2 = "RA10001PID";

        MatcherAssert.assertThat(result1, Matchers.is(expected1));
        MatcherAssert.assertThat(result2, Matchers.is(expected2));
    }

    @Test
    public void getSequence_WithConcurrentThreadsAccessingSequenceGenerator_ReturnsCorrectSequence() throws Exception {
        Thread thread = null;
        for (int i = 0; i < 100; i++) {
            thread = new Thread(() -> concurrentAccessTestSequenceGenerator.getSequence());
            thread.start();
        }
        thread.join();

        // Expected sequence after 100 concurrent access is:
        String expected = "RA10100PID";

        String result = concurrentAccessTestSequenceGenerator.getSequence();
        MatcherAssert.assertThat(result, Matchers.is(expected));
    }
}
