package ru.job4j.calculator;
//1.1. Входные данные в тесте [#363008]
//1. Добавьте методы тестирования по аналогии с методом
//        whenA10B9C0X2Then40
//        Укажите разные случаи входных параметров.
//        - a = 1, b = 1, c = 1, x = 1.
//        - a = 0, b = 1, c = 1, x = 1.
//        - a = 1, b = 1, c = 0, x = 1.
//        - a = 1, b = 1, c = 1, x = 0.
//        Переменную expected нужно вычислить для каждого случая отдельно.

import org.junit.Test;

import org.junit.Assert;

public class X2Test {

    @Test
    public void whenA1B1C1X1Then3() {
        // входные параметры
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 3;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */

        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);

    }

    @Test
    public void whenA0B1C1X1Then2() {
        // входные параметры
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 2;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */

        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);

    }

    @Test
    public void whenA1B1C0X1Then2() {
        // входные параметры
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 2;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */

        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);

    }

    @Test
    public void whenA1B1C1X0Then1() {
        // входные параметры
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 1;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */

        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);

    }
}