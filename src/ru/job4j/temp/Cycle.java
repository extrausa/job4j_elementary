package ru.job4j.temp;

public class Cycle {
    public static int mult(int a, int b) {
        int result = 1;

        for (int i = a; i <= b; i++) {

            result = i * result;

        }

        return result;
    }

    public static int calculate(int a, int n) {
        a = (int) Math.pow(a, n);
        return a;

    }

    public static void out(int n) {
        for (int i = 0; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }

        }

    }

    public static int mod(int n, int d) {

        while (n >= d) {
            n -= d;

        }
        return n;
    }

    public static void main(String[] args) {



    }

}
