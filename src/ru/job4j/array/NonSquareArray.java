package ru.job4j.array;

public class NonSquareArray {
    public static void main(String[] args) {
        int a = 1, b = 1;
        int[][] array = new int[2][a];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].length);
            a++;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = b;
                b++;
                System.out.print(array[i][j]);



            }

        }


    }
}
