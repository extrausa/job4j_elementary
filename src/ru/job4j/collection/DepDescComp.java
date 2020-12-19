package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String firstS, String secondS) {
        String[] first = firstS.split("/");
        String[] second = secondS.split("/");
        int rsl = 0;
        for (int i = 0; i < first.length; i++) {
            rsl = first[i].compareTo(second[i]);
        }
        rsl = rsl == 0 ? rsl = firstS.compareTo(secondS): rsl;
        return rsl;
    }
}
