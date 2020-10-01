package ru.job4j.array;
//6.6.2. Двухмерный массив. Циклы. [#362960]
public class MatrixSum {

    public static int sum(int[][] array) {
        int rsl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rsl = rsl + array[i][j];
            }
        }
        return rsl;
    }
}
