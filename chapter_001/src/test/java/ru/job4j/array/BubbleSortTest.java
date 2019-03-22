package ru.job4j.array;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void checkSortedArray(){
        BubbleSort sort = new BubbleSort();
        int[] array = {5, 4, 7, 0, 1, 9};
        int[] sorted = sort.sort(array);
        int[] expected = {0, 1, 4, 5, 7, 9};
        assertThat(sorted, is(expected));
    }
}
