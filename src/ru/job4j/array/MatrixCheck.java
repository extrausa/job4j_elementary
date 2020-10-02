package ru.job4j.array;
//6.7.1. Моно строка в матрице. [#362949]
public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char word = 'X';
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[row][j] != word) {
                    result = false;
                    break;
                }


            }

        }
        return result;
    }
}
