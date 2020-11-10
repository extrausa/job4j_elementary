package ru.job4j.ex;
//0.1. java.lang.NullPointerException [#363098]
public class FindMaxLength {
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int i = 0; i < shops.length; i++) {
            String el = shops[i];
            if (el != null) {
                max = el.length();
            }
        }
        System.out.println("Max length : " + max);
    }
}
