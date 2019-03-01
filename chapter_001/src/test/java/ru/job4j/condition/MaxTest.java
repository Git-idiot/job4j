package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void TwoIsMoreThenOneThen2() {
        Max max = new Max();
        int result=max.max(2,1);
        int expected = 2;
        assertThat(result, is(expected));
    }
    @Test
    public void OneIsLessThenTwoThen2() {
        Max max = new Max();
        int result=max.max(1,2);
        int expected = 2;
        assertThat(result, is(expected));
    }
    @Test
    public void OneIsEqualOneThen1() {
        Max max = new Max();
        int result=max.max(1,1);
        int expected = 1;
        assertThat(result, is(expected));
    }
}
