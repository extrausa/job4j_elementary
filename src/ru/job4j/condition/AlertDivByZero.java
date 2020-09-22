package ru.job4j.condition;
//4.1. Операторы ветвлений [#362933]
public class AlertDivByZero {
    public static void main(String[] args) {
        posibleDiv(-4);
        posibleDiv(0);
    }

    public static void posibleDiv(int a) {
        if (a < 0) {
            System.out.println("This is negative numbers");
        } else  {
            System.out.println("good");
        }
    }
}
