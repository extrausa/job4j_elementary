package ru.job4j.array;
//6.0.1. Объявление массива. [#362967]
//6.0.1.1. Размер массива [#362963]
//6.0.2. Заполнение массива. [#362952]
public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new    float[40];
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
        String[] names = new    String[4];
        names[0] = "Андрей";
        names[1] = "Женя";
        names[2] = "Виктор";
        names[3] = "Семен";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
