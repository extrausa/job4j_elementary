package ru.job4j.condition;
//4.2. Тернарное сравнение [#362931]
//3. Перегрузить метод max для трех чисел [#363129]
public class Max {
    public static int max(int left, int right) {
        boolean condition = left >= right;
        int result = condition ? left : right;
        return result;
    }

    public static int max(int left, int right, int before) {
//        int tmp = max(right, before);
//        return max(left, tmp);
        return max(left, max(right,before));

    }

    public static int max(int left, int right, int before, int backside) {
//        int tmp = max(right,before,backside);
//        return max(left, tmp);

        return max(left, max(right,before,backside));
    }


    public  static void main(String[] args) {
        int result = Max.max(9, 5);
        System.out.println(result);
    }
}
