package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class PrimeNumberTest {

    @Test
    public void when5() {
        int count = PrimeNumber.calc(5);
        assertThat(count, is(3));
    }

    @Test
    public void when11() {
        int count = PrimeNumber.calc(11);
        assertThat(count, is(6));
    }

    @Test
    public void when2() {
        int count = PrimeNumber.calc(2);
        assertThat(count, is(1));
    }
}