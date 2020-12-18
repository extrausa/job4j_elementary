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
                tmp.add(start + "/" + el);
            }
        }
        for (String val : tmp) {
            if (val.length() == 3) {
                String z = val.substring(1);
                rsl.add(z);
            } else {
                rsl.add(val);
            }
        }


        return rsl;
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Collections.reverseOrder());


    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }
}
