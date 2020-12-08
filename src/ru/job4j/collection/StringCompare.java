package ru.job4j.collection;
//3. Компаратор для строк [#363052]
import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int letter = 0;

        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            letter = Character.compare(left.charAt(i), right.charAt(i));
            if (letter != 0) {
               return letter;
            }

        }
        return letter = Integer.compare(left.length(), right.length());

        }
    }




