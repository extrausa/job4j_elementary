package ru.job4j.condition;
//8. Стороны прямоугольника. [#362974]
//В этом задании необходимо вычислить площадь прямоугольника. Известны периметр и соотношение сторон прямоугольника.
//        Периметр прямоугольника вычисляется по следующей формуле:
//        p = 2 * (L + h); где L - длина, h - высота.
//        В задании известно, что длина больше высоты в k раз.
//        L = h * k;
//        В программе известны периметр прямоугольника и коэффициент K.
//        Вам нужно по этим параметрам вычислить длину и высоту прямоугольника,
//        а потом вычислить площадь полученного прямоугольника.
//        s = L * h; - формула для вычисления площади прямоугольника.
//        Пример.
//        Если p = 6, а k = 2, то площадь будет равна S = 2.
//        Если p = 4, а k = 1, то площадь будет равна S = 1.
public class SqArea {
    public static double square(int p, int k) {
        double  h = p / (2 * (k + 1));
        double l = h * k;
        double area = h * l;
        return  area;
    }

    public static void main(String[] args) {
        int p = 6;
        int k = 2;
        double square = SqArea.square(p, k);
        System.out.println("p = 6, k = 2, square = " + square);
    }
}
