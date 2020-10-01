package ru.job4j.array;
//6.5. Поиск индекса в диапазоне. [#362945]
// el - элемент, который нужно найти,
// start - индекс, с которого начинаем поиск,
// finish - индекс, которым заканчиваем поиск.
public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        if (finish > data.length) {
            return rst;
        }
        for (int i = start; i < finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

}
