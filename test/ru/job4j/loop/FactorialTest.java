package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */

        assertThat(Factorial.calc(5), is(120));

    }

    @Test
    public void whenCalculateFactorialForThreeThenSix() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        assertThat(Factorial.calc(3), is(6));
    }

    @Test
    public void whenCalculateFactorialForZerroThenOne() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        assertThat(Factorial.calc(0), is(1));
    }
}