package ru.job4j.loop;
//5.5. Простое число [#363030]
public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        }

        for (int i = 2; i <= number - 1; i++) {
            if ((number % i) == 0) {

                prime = false;
                break;
            }
            return prime;
        }
        return prime;
    }
}
