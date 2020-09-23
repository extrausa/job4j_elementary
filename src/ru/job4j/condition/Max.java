package ru.job4j.condition;
//4.2. Тернарное сравнение [#362931]
public class Max {
    public static int max(int left, int right) {
        boolean condition = left >= right;
        int result = condition ? left : right;
        return result;
    }

    public  static void main(String[] args) {
        int result = Max.max(9, 5);
        System.out.println(result);
    }
}
