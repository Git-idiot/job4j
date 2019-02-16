package ru.job4j.converter;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void whenSeventyRubleIsOneEuro(){
        Converter rubleEuro = new Converter();
        int res=rubleEuro.rubleToEuro(70);
        int expected=1;
        assertThat(res, is(expected));
    }
    @Test
    public void whenSixtyRubleIsOneDollar(){
        Converter rubleDollar = new Converter();
        int res = rubleDollar.rubleToDollar(60);
        int expected=1;
        assertThat(res, is(expected));
    }
    @Test
    public void whenOneEuroIsSeventyRubles(){
        Converter euroRuble=new Converter();
        int res = euroRuble.euroToRuble(1);
        int expected = 70;
        assertThat(res, is(expected));
    }
    @Test
    public void whenOneDollarIsSixtyRubles(){
        Converter dollarRuble=new Converter();
        int res = dollarRuble.dollarToRuble(1);
        int expected = 60;
        assertThat(res, is(expected));
    }
}
