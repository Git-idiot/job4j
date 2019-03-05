package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void SumFromOneToTenIs30(){
        Counter sum = new Counter();
        int evenSum = sum.add(0,10);
        assertThat(evenSum, is(30));
    }

}
