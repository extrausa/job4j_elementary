package ru.job4j.collection;
//0. Коллекции, ArrayList, List, Обобщения [#363064]
import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");

        for (Object value: names) {
            System.out.println(value);

        }
    }
}
