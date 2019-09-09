package ru.job4j.tracker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private final PrintStream out = System.out;

    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void loadSys() {
        System.setOut(this.out);
    }

    @Test
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"invalid", "1"})
        );
        input.ask("Enter", new int[] {1});
        assertThat(
                this.mem.toString(),
                is(
                        String.format("Введите корректное значение%n")
                )
        );
    }
    @Test
    public void whenInvalidDataFormatInput() {
        ValidateInput input = new ValidateInput(new StubInput(new String[] {"wrong", "key"}));
        input.ask("Test question", new int[0]);
        assertThat(this.mem.toString(),
                is(String.format("Введите корректное значение\r\nВведите корректное значение\r\n")));
    }
    @Test
    public void whenInvalidMenuKeyInput() {
        ValidateInput input = new ValidateInput(new StubInput(new String[] {"10", "12"}));
        input.ask("Test question", new int[0]);
        assertThat(this.mem.toString(), is("Введите значение из диапазона\r\nВведите значение из диапазона\r\n"));
    }
}
