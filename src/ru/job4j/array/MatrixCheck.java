package ru.job4j.array;
//6.7.1. Моно строка в матрице. [#362949]
//6.7.2. Моно столбец в матрице. [#362950]
//6.7.3. Массив из диагонали матрицы. [#362951]
//6.7.4. Выигрышные комбинации в сокобан [#362942]
public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char word = 'X';
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != word) {
                result = false;
                break;
            }

        }

        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        char word = 'X';
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != word) {
                result = false;
                break;
            }

        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {

                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
