package ru.job4j.condition;
//7. Расстояние между точками в системе координат [#362984]
public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double point = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        return point;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 2, 3, 5);
        System.out.println("result (x1 = 0, y1 = 2) to ( x2 = 3, y2 = 5) " + result);
    }
}
