package ru.job4j.collection;

import java.util.Collection;
import java.util.HashSet;

//Для выполнения первого - нужно использовать HashSet
public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean result = false;
        HashSet<String> originH = new HashSet<String>();
        String[] subStr;
        String delimeter = "[\\s.,!:]+";
        subStr = origin.split(delimeter);
        String[] subStrl;
        subStrl = line.split(delimeter);
        for (int i = 0; i < subStr.length; i++) {
            originH.add(subStr[i]);
        }
        int count = originH.size();
        for (int i = 0; i < subStrl.length; i++) {
            originH.add(subStrl[i]);
        }
        int countSecond = originH.size();
        if (count == countSecond) {
            result = true;
        }
        return result;
    }
}
