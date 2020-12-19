package ru.job4j.collection;

import java.util.*;
//2. Отсортировать департаменты [#363048]
public class Department {

    public static List<String> fillGaps(List<String> deps) {
        List<String> rsl = new ArrayList<>();
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (el.length() == 2) {
                    start += el;
                } else  {
                    start = start + "/" + el;
                }
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        Comparator<String> dep = new DepDescComp();
        orgs.sort(dep);
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }
}
