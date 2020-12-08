package ru.job4j.collection;
//4. Сортировка номера [#363053]
import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int leftA = Integer.parseInt(left.substring(0, left.indexOf(".")));
        int rightB = Integer.parseInt (right.substring(0, right.indexOf(".")));

        return Integer.compare(leftA, rightB);
    }

}
