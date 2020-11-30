package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int numb = 2 + (right.length / 2) + (middle.length / 2);
        int[] arrayRsl = new int[numb];
        for (int i = 0; i < arrayRsl.length; i++) {
            if (i == 0) {
                arrayRsl[i] = left[i];
            }
            if (i == numb - 1) {
                arrayRsl[i] = left[left.length-1];
            }
        }

        for (int i = 0; i < middle.length; i++) {
            if(i % 2 != 0) {
                arrayRsl[i + 1] = middle[i];
            }

        }
        for (int i = 0; i < right.length; i++) {
            if(i % 2 == 0) {
                arrayRsl[i + 1] = right[i];
            }

        }


        return arrayRsl;
    }

}
