package ru.job4j.collection;
//0. Set, HashSet, Iterator. [#363074]
import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        autos.add("Lada");
        autos.add("Volvo");
        autos.add("BMW");
        autos.add("Toyota");
        for (String cars : autos) {
            System.out.println(cars);
        }
    }
}
