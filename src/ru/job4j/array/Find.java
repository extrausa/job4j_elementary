package ru.job4j.array;

public class Find {
    public static int find(int[] array) {
        int count = 0;
        if(array.length <= 2) {
            count = 1;

        }

        for(int i = 0; i < array.length - 1; i++) {

            if(array[i] <= array[i + 1]) {
                count ++;
            }
        }
        if (count == 0 && array.length > 2) {
            count++;
        }
        return count;
    }


}
