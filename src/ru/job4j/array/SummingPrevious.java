package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] array = new int[n];
        int summ = a + b;
        for(int i = 0; i < array.length; i++) {
            if(i == 0) {
                array[i] = a;
            }
            if(i == 1) {
                array[i] = b;
            }
            if(i >= 2)  {
                array[i] = summ;
                summ += array[i];
            }


        }
        return array;

    }
}
