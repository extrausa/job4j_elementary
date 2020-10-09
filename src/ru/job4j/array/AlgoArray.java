package ru.job4j.array;
//6.2. Упорядочить массив. [#362968]
public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[4];
        array[4] = array[3];
        array[3] = temp;
        temp = array[2];
        array[2] = array[1];
        array[1] = temp;
        temp = array[4];
        array[4] = array[0];
        array[0] = temp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
