package ru.job4j.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int sizeArray = data.length;
        int z = data[0].length;
        int[] result = new  int[sizeArray];

        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result[count] = data[i][z - 1];
                count++;
                z--;
                break;

            }

        }
        return result;
    }
}
