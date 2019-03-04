package ru.job4j.condition;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void WhenSecondMax(){
        MultiMax multiMax = new MultiMax ();
        int res=multiMax.multiMax(3,10,1);
        assertThat(res, is(10));
    }
}
