package ru.job4j.collection;
//2. Идентичные тексты [#363072]
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String ch: origin) {
            check.add(ch);
        }
        for (String st:text) {
            if (!check.contains(st)){
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
