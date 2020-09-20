package ru.job4j.calculator;

public class Fit {
//    Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
//
//    Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
    public static double manWeight(short height){
        double result = (height - 100) * 1.15;
        return  result;

    }
    public static double womanWeight(short height){
        double result = (height - 110) * 1.15;
        return  result;
    }

    public static void main(String[] args){
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println(man);
        height = 180;
        double woman = Fit.womanWeight(height);
        System.out.println(woman);

    }
}
