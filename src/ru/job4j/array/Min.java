package ru.job4j.array;
//6.5.1. Поиск минимального числа в массиве. [#362947]
public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];

            }

        }
        return min;
    }
}
