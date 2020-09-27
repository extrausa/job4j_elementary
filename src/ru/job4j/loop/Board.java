package ru.job4j.loop;
//5.3. Построить шахматную доску в псевдографике. [#363039]
public class Board {
    public static void paint(int width, int height) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(5, 4);

    }
}
