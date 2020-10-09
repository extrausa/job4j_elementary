package ru.job4j.loop;
//5.0.1. Сумма чисел. [#363032]
//5.1. Подсчет суммы чётных чисел в диапазоне [#363035]
public class Counter {
    public static int summ(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if ((i % 2) == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
