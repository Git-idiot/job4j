package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    /**
     * Square test for n=3.
     */
    @Test
    public void whenN3Then014() {
        Square arrSquare = new Square();
        int[] result = arrSquare.fillSquare(3);
        int[] expected = {0, 1, 4};
        assertThat(result, is(expected));

    }
    /**
     * Square test for n=-1.
     */
    @Test
    public void whenNNegativeThen0() {
        Square arrSquare = new Square();
        int[] result = arrSquare.fillSquare(-1);
        int[] expected = {1};
        assertThat(result, is(expected));

    }
    /**
     * Square test for n=0.
     */
    @Test
    public void whenNZeroThen0() {
        Square arrSquare = new Square();
        int[] result = arrSquare.fillSquare(0);
        int[] expected = {1};
        assertThat(result, is(expected));

    }
}
