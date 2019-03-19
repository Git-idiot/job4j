package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    /**
     * Проверка переворота массива с четным кол-вом элементов
     */
    @Test
    public void turnEvenArray(){
        Turn turn = new Turn();
        int[] array = {5, 3, 1, 4};
        int[] result =turn.turnArray(array);
        int[] expected = {4, 1, 3, 5};
        assertThat(result, is(expected));
    }
    /**
     * Проверка переворота массива с нечетным кол-вом элементов
     */
    @Test
    public void turnOddArray(){
        Turn turn = new Turn();
        int[] array = {5, 3, 1, 4, 0};
        int[] result =turn.turnArray(array);
        int[] expected = {0, 4, 1, 3, 5};
        assertThat(result, is(expected));
    }
}
