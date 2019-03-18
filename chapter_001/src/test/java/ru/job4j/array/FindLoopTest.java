package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    /**
     * Поиск элемента в массиве. Элемент в массиве присутствует
     */
    @Test
    public void elementExist(){
        FindLoop findLoop = new FindLoop();
        int[] array = {5, 2, 3, 7, 9};
        int result = findLoop.indexOf(array, 3);
        int expected = 2;
        assertThat(result, is(expected));
    }
    /**
     * Поиск элемента в массиве. Элемента в массиве нет
     */
    @Test
    public void elementNotExist(){
        FindLoop findLoop = new FindLoop();
        int[] array = {5, 2, 2, 7, 9};
        int result = findLoop.indexOf(array, 3);
        int expected = -1;
        assertThat(result, is(expected));
    }


}
