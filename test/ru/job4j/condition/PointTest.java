package ru.job4j.condition;
//3. Тесты для определения расстояния между точками. [#363005]
import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point x = new Point(0,0);
        Point y = new Point(2,0);

        double out = x.distance(y);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to35then424() {
        double expected = 4.24;
        Point x = new Point(0,2);
        Point y = new Point(3,5);
        double out = x.distance(y);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to42then360() {
        double expected = 3.60;
        Point x = new Point(1,0);
        Point y = new Point(4,2);
        double out = x.distance(y);
        Assert.assertEquals(expected, out, 0.01);
    }
}