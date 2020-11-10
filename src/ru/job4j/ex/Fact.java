package ru.job4j.ex;
//0.2. Кидаем исключение - throw new RuntimeException [#363099]
public class Fact {
    public static void main(String[] args) {
        Fact fact = new Fact();
        int a = 5;

        System.out.println(fact.calc(a));

    }

    public static int calc(int n) {
        int rsl = 1;
        if (n < 0) {
            throw new IllegalArgumentException("N could not be less then 0");
        }
        for (int i = 1; i <= n; i++) {
            rsl *= i;
        }
        return rsl;
    }
}
