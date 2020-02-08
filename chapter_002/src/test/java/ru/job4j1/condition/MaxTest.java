package ru.job4j1.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void whenMax1To2Then2(){
        int result = Max.max(1,2);
        assertThat(result, is(2));
    }
    @Test
    public void whenmax(){
        double result = Max.max(1,2);
        assertThat(result, is(2.0));
    }
}
