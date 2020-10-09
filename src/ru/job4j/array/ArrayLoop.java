package ru.job4j.array;
//6.0.3. Массивы и цикл for. [#362953]
//6.0.3.1. Массивы и цикл for-earch [#362962]
public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }
        for (int list: numbers) {
            System.out.println(list);
        }

//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//
//        }

    }
}
