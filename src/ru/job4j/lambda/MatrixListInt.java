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
    public static void main(String[] args) {
        Integer[][] matrx = {
            {1,2,3},
            {2,3,4},
            {3,4,5}
        };

        List<Integer> con = convert(matrx);
        con.stream().forEach(integer -> System.out.println(integer));
    }


}
