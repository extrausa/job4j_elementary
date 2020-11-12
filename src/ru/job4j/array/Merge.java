package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while ((i <= left.length - 1) && (j <= right.length - 1)) {
            if (left[i] < right[j]) {
                rsl[k] = left[i];
                i++;
            } else {
                rsl[k] = right[j];
                j++;
            }
            k++;
        }

        while (i <= left.length - 1) {
            rsl[k] = left[i];
            i++;
            k++;
        }
        while (j <= right.length - 1) {
            rsl[k] = right[j];
            j++;
            k++;
        }

        return rsl;
    }

    public static int[] mergeSquare(int[][] data) {
        int row = data.length;
        int col = data[0].length;
        int count = 0;
        //int col = data[][]
        int[] arrayResult = new int [col * row];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                arrayResult[count] = data[i][j];
                count++;
            }

        }
        return arrayResult;
    }
}
