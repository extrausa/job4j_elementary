package ru.job4j.loop;
//5.6. Простые числа [#363028]
public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int i = 1; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                count++;
            }
        }
        return count;
    }
}
