package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void when222thentrue() {
        boolean expected = true;
        boolean res = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(res, is(true));
    }
}