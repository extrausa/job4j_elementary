package ru.job4j.array;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int countColl = 1;
        int numb = 1;
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[countColl];
            countColl++;
            for (int j = 0; j < triangle[i].length; j++) {

                triangle[i][j] = numb;
                numb++;
            }

        }
        return triangle;
    }

}
