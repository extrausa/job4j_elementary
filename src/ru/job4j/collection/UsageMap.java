package ru.job4j.collection;
//0. Map, HashMap [#363066]
import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> employe = new HashMap<>();
        employe.put("sd@ya.ru", "Ivanov Ivan Ivanovich");
        for (String name : employe.keySet()) {
            String value = employe.get(name);
            System.out.println(name + " = " + value);
        }
    }
}
