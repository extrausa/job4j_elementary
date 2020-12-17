package ru.job4j.collection;
//2. Проверить две строчки на идентичность.
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        boolean result = true;
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
        for (int i = 0; i < rightToArray.length; i++) {
            Integer co = first.get(rightToArray[i]);
            if (!first.containsKey(rightToArray[i])){
                result = false;
                break;
            }
            if (first.containsKey(rightToArray[i]) && co > 0) {
                first.put(rightToArray[i], co - 1);
            } else {
                first.remove(rightToArray[i], co);
                result = false;
                break;
            }
        }

        return result;
    }
}
