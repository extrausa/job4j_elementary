package ru.job4j.condition;
//4. Тесты для стороны прямоугольника. [#363006]
import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenp6tok2then2() {
        double expected = 2.0;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenp8tok2then2() {
        double expected = 2.0;
        int p = 8;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}