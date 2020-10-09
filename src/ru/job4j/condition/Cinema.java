package ru.job4j.condition;
//4.1.0. Оператор if с блоком else [#362919]
//4.3.1. Оператор && [#362925]
public class Cinema {
    public static void main(String[] args) {
        Cinema.access(true);
        Cinema.access(false);
        boolean allowByParent = true;
        boolean hasMoney = false;
        Cinema.permicion(allowByParent, hasMoney);
    }

    public static void access(boolean access) {
        System.out.println("The age of the customer is : " + access);
        if (access) {
            System.out.println("Welcome to the cinema");
        } else {
            System.out.println("It is not for you");
        }

    }

    public static void permicion(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the cinema");
        } else {
            System.out.println("I can't");
        }
    }
}
