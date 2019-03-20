package ru.job4j.array;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    /**
     * Сравнение элементов в массиве. В массиве четное кол-во элементов
     */
    @Test
    public void trueFalseArrayEven(){
        Check check = new Check();
        boolean[] arr = {true, true, true, false};
        boolean res = check.trueOrFalse(arr);
        boolean expected = false;
        Assert.assertThat(res, is(expected));
    }
    /**
     * Сравнение элементов в массиве. В массиве нечетное кол-во элементов
     */
    @Test
    public void trueFalseArrayOdd(){
        Check check = new Check();
        boolean[] arr = {true, false, true};
        boolean res = check.trueOrFalse(arr);
        boolean expected = false;
        Assert.assertThat(res, is(expected));
    }
}
