package ru.job4j.condition;
//4.1.0. Оператор if с блоком else [#362919]
public class Cinema {
    public static void main(String[] args) {
        Cinema.access(true);
        Cinema.access(false);
    }

    public static void access(boolean access) {
        System.out.println("The age of the customer is : " + access);
        if (access) {
            System.out.println("Welcome to the cinema");
        } else {
            System.out.println("It is not for you");

        }

    }
}
