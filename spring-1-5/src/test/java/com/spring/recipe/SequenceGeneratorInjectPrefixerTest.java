package com.spring.recipe;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/beans.xml")
public class SequenceGeneratorInjectPrefixerTest {

    private @Autowired SequenceGeneratorInjectPrefixer subject;

    @Test
    public void getSequence_ReturnsSequenceWithDateInYYYYMMDDFormatAsPrefix() {
        String result = subject.getSequence();
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String date = dateFormat.format(new Date());
        String expected = date + 10001;

        MatcherAssert.assertThat(result, Matchers.is(expected));
    }
}
