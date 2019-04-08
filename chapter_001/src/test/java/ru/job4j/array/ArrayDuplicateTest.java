package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    /**
     * Проверка обрезанного массива
     */
    @Test
    public void checkShortenArray(){
        ArrayDuplicate dupl = new ArrayDuplicate();
        String[] ar = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = dupl.remove(ar);
        String[] expected = {"Привет", "Супер", "Мир"};
        assertThat(result, is(expected));
    }
}
