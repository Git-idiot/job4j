package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    @Test
    public void pyramidHeight2() {
        Paint pyramid = new Paint();
        String p = pyramid.piramid(2);
        String ln = System.lineSeparator();
        assertThat(p,is(String.format(" ^ %s^^^%s", ln, ln)));
    }
}
