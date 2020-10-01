package ru.job4j.array;
//6.5.3. Сортировка выборкой. [#362946]
public class SortSelected {
    public static int[] sort(int[] data) {
        int temp;
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1); // мин.значение
            int index = FindLoop.indexOf(data, min, i, data.length - 1); // индекс
            temp = data[i];
            data[i] = data[index];
            data[index] = temp;

        }
        return data;

    }
}
