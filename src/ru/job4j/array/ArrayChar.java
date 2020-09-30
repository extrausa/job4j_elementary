package ru.job4j.array;
//6.4. Слово начинается с ... [#362940]
public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        for (int i = 0; i < pref.length; i++) {
//            if (word.length != pref.length) {
//                result = false;
//                break;
//            }
            if (word[i] == pref[i]) {
                result = true;

            }
            result = false;

        }
        return result;
    }
}
