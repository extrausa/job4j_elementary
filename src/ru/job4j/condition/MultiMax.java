package ru.job4j.condition;

import java.beans.PropertyEditorSupport;

//4.4. Вложенный оператор if else [#362932]
//внутри метода max нужно сравнить попарно первое со вторым и максимум из них сравнить с третьим числом.
//В методе нужно использовать несколько раз тернарный оператор условия.
public class MultiMax {
    public static int max(int first, int second, int third) {
        int one = first >= second ? first : second;
        int two = one >= third ? one : third;
        return two;
    }

    public static void main(String[] args) {
        int first = 9;
        int second = 5;
        int third = 9;
        int result = MultiMax.max(first, second, third);
        System.out.println(result);
    }

}
