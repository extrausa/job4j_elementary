package ru.job4j.array;
//6.6.8. Двухмерный массив. Таблица умножения. [#362938]
public class Matrix {
    public static int[][] multiple(int size) {
        int[][] tableMultiple = new int[size][size];
        for (int i = 0; i < tableMultiple.length; i++) {
            for (int j = 0; j < tableMultiple.length; j++) {

                tableMultiple[i][j] = (i + 1) * (j + 1);

            }

        }
        return tableMultiple;
    }

    public static void main(String[] args) {
        int[][] array = Matrix.multiple(9);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" " + array[i][j] + " ");

            }
            System.out.println();

        }
    }
}
