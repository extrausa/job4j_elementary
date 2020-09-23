package ru.job4j.condition;
//4.3.5. Множественное логическое выражение И [#362934]
//Нужно проверить, что ab + ac > bc и ac + bc > ab и ab + bc > ac - в этом случае треугольник существует.
//В этом задании нужно использовать булеву логику и оператор && (логическое и).
public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
//        ab + ac > bc;
//        ac + bc > ab;
//        ab + bc > ac;
        if (ab + ac > bc & ac + bc > ab & ab + bc > ac) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        boolean res = Triangle.exist(2.0, 2.0, 2.0);
        System.out.println(res);

    }
}
