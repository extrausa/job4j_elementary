package ru.job4j.oop;
//3.1. Приведение типов. Повышение типа и понижение типа. [#363084]
public class College {
    public static void main(String[] args) {
        Freshman fresh = new Freshman();
        Student first = fresh;
        Object obj = fresh;

    }
}
