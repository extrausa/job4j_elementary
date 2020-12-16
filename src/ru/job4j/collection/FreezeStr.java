package ru.job4j.collection;
//2. Проверить две строчки на идентичность.
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        boolean result = false;
        int count = 1;
        char[] leftToArray = left.toCharArray();
        char[] rightToArray = right.toCharArray();
        HashMap<Character, Integer> first = new HashMap();
        for (int i = 0; i < leftToArray.length; i++) {
            if (!first.containsKey(leftToArray[i])) {
                first.putIfAbsent(leftToArray[i], count);
            } else {
                Integer co = first.get(leftToArray[i]) + 1;
                first.put(leftToArray[i], co);
            }
        }
        Integer sumVal = 0;
        for (Integer n : first.values()) {
            sumVal += n;
        }
        for (int i = 0; i < rightToArray.length; i++) {
            if (first.containsKey(rightToArray[i])) {
                Integer co = first.get(rightToArray[i]) - 1;
                first.put(rightToArray[i], co);
            } else {

                first.put(rightToArray[i], ++count);
            }
        }
        Integer sumRight = 0;
        for (Integer n : first.values()) {
            sumRight += Math.abs(n);
        }
        if (sumRight == 0 ) {
            result = true;
        }
        return result;
    }
}
