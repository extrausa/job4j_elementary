package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class MaxTest {

    @Test
    public void when5to4then5() {
        int expected = 5;
        int x = 5;
        int y = 4;
        int out = Max.max(x, y);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when4to9then9() {
        int expected = 9;
        int x = 4;
        int y = 9;
        int out = Max.max(x, y);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when5to5then5() {
        int expected = 5;
        int x = 5;
        int y = 5;
        int out = Max.max(x, y);
        Assert.assertEquals(expected, out);
    }
}