package ru.job4j.lambda;
//5. Подсчет функции в диапазоне. [#362878]
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FunctionDiapasonTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionDiapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadroFunctionThenLinearResults() {
        List<Double> result = FunctionDiapason.diapason(5, 8, x -> 2 * Math.pow (x, 2) + 1 * x + 2);
        List<Double> expected = Arrays.asList(57D, 80D, 107D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenIndicativeFunctionThenLinearResults() {
        List<Double> result = FunctionDiapason.diapason(5, 8, x -> 2 * Math.pow (x, x));
        List<Double> expected = Arrays.asList(6250D, 93312D, 1647086D);
        assertThat(result, is(expected));
    }

}