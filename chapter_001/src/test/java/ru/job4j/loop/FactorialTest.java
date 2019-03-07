package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void factorial3Is6 () {
        Factorial factorial = new Factorial();
        int f= factorial.calc(3);
        assertThat(f, is(6));
    }
    @Test
    public void factorialZeroIs1 () {
        Factorial factorial = new Factorial();
        int f = factorial.calc(0);
        assertThat(f, is(1));
    }
}
