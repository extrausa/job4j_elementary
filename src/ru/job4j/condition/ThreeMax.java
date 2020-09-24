package ru.job4j.condition;
//4.5. Отладка программы в IDEA [#362918]
public class ThreeMax {
    public static int max(int first, int second, int third) {
        if (first >= second & first >= third) {
            return first;
        }
        if (second >= first & second >= third) {
            return second;
        }
        return third;
    }

    public static void main(String[] args) {
        int first = 10;
        int second = 10;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        System.out.println(result);

    }
}
