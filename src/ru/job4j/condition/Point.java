package ru.job4j.condition;
//7. Расстояние между точками в системе координат [#362984]
//2.1. Рефакторинг - Расстояние между точками. [#363126]
//4. Расстояние между точками в трехмерном пространстве. [#363128]
import static java.lang.Math.sqrt;

import static java.lang.Math.pow;

public class Point {
    private int x;
    private  int y;
    private int z;


    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }
//    public static double distance(int x1, int y1, int x2, int y2) {
//        double point = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
//        return point;
//    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

    public double distance3d(Point that) {
        return sqrt(pow(that.x - this.x, 2) + pow(that.y - this.y, 2) + pow(that.z - this.z, 2));

    }

    public static void main(String[] args) {
//        double result = Point.distance(0, 2, 3, 5);
//        System.out.println("result (x1 = 0, y1 = 2) to ( x2 = 3, y2 = 5) " + result);
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
