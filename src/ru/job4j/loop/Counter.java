package ru.job4j.loop;
//5.0.1. Сумма чисел. [#363032]
public class Counter {
    public static int summ(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Counter.summ(3, 9));
        System.out.println(Counter.summ(10, 12));
        System.out.println(Counter.summ(0, 5));
    }
}
