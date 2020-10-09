package ru.job4j.array;
//6.8. Дефрагментация массива [#362966]
public class Defragment {
public static String[] compress(String[] array) {
    for (int index = 0; index < array.length; index++) {
        if (array[index] == null) {
            int point = index; /* указатель на null ячейку. */
            /* переместить первую не null ячейку. Нужен цикл. */
            for (int i = point; i < array.length; i++) {
                if (array[i] != null) {
                    array[point] = array[i];
                    array[i] = null;
                    break;
                }
            }
        }
        System.out.print(array[index] + " ");
    }
    return array;
}
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
