package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {

        int result = -1;
        String word = new String(string);
        word.indexOf(c);
        if (number == 1) {
            if (word.indexOf(c) >= 0) {
                result = string.length - 1;
            }

        }
        if (number == 2) {
            if (word.indexOf(c) >= 0) {
                result = string.length - 1;
            }

        }

        return result;
    }
}
