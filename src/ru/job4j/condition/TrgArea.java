package ru.job4j.condition;
//9. Площадь треугольника. [#362977]
public class TrgArea {
    public static double area(double a, double b, double c){
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
    public static void main(String[] args){
        double a = 2;
        double b = 2;
        double c = 2;
        double area = TrgArea.area(a, b, c);
        System.out.println("area a = 2, b = 2, c = 2 area = " +area);

    }
}
