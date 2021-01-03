package ru.job4j.lambda;
//5. Преобразование матрицы чисел в список чисел. [#362897]
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixListInt {
    public static List<Integer> convert(Integer[][] matrix) {
         return Stream.of(matrix)
                .flatMap(integers -> Arrays.stream(integers))
                .collect(Collectors.toList());
    }

}
