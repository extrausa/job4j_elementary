package ru.job4j.collection;

import java.util.Collection;
import java.util.HashSet;

//Для выполнения первого - нужно использовать HashSet
public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean result = true;
        HashSet<String> text = new HashSet<String>();
        String[] newOrign = origin.replaceAll("\\p{Punct}", "").split(" ");
        String[] lineOrign = line.replaceAll("\\p{Punct}", "").split(" ");

        for (int i = 0; i < newOrign.length; i++) {
            text.add(newOrign[i]);
        }
        for (int i = 0; i < lineOrign.length; i++) {
            if (!text.contains(lineOrign[i])){
                result = false;
                break;
            }
        }



        return result;

    }
}
