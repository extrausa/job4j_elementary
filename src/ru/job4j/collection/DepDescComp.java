package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String s, String t1) {
        return t1.compareTo(s);
    }
}
