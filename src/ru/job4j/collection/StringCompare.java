package ru.job4j.collection;
//3. Компаратор для строк [#363052]
import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int letter = 0;
        if (left.length() < right.length()) {
            return letter = 1;
        }
        if (left.length() > right.length()) {
            return letter = -1;
        }
        for (int i = 0; i < left.length(); i++) {
            letter = Character.compare(left.charAt(i), right.charAt(i));
            if (letter != 0) {
                letter = 1;
                break;
            }

        }
        return letter;
    }
    }




