package com.spring.recipe.product;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/beans.xml")
public class ProductTest {

    private
    @Autowired
    Battery battery;

    private
    @Autowired
    Disc disc;

    @Test
    public void testBattery_WithAllParameters() {
        Battery expected = new Battery("battery", 25.00);
        expected.setRechargeable(true);

        MatcherAssert.assertThat(battery, Matchers.is(expected));
    }

    @Test
    public void testDisc_WithAllParameters() {
        Disc expected = new Disc("disc", 10.00);
        expected.setRpm(1000);

        MatcherAssert.assertThat(disc, Matchers.is(expected));
    }
}
