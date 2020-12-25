package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDiapason {

    public static List<Double> diapason(int start, int end, Function<Double, Double> function){
        List<Double> rsl = new ArrayList<>();
        for (int i = start; i < end; i++) {
            int a = 0;
            rsl.add(function.apply((double)i));

        }
        return rsl;
    }
}

