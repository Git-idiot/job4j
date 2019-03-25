package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {
    /**
     * Проверка массива с одинаковыми диагоналями
     */
    @Test
    public void checkArrayWithTwoEqualDiagonals(){
        MatrixCheck matrixCheck = new MatrixCheck();
        boolean mtr[][] = {{true, true, true}, {false, true, true},{true, false, true}};
        boolean res = matrixCheck.check(mtr);
        boolean expected = true;
        assertThat(res, is(expected));
    }
    /**
     * Проверка массива с разными диагоналями
     */
    @Test
    public void checkArrayWithTwoDifferentDiagonals(){
        MatrixCheck matrixCheck = new MatrixCheck();
        boolean mtr[][] = {{true, false}, {false, true}};
        boolean res = matrixCheck.check(mtr);
        boolean expected = true;
        assertThat(res, is(expected));
    }
}
