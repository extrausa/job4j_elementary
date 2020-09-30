package ru.job4j.array;
//6.4.1. Сравнить последние элементы двух массивов [#362959]
public class EqLast {
    public static boolean check(int[] left, int[] right) {
//        for (int i = left.length - 1; i >= 0; i--) {
//            if (left[i] == right[i]) {
//                return true;
//            }
//        }
//        return false;
        return left[left.length - 1] == right[right.length - 1];

    }
}
