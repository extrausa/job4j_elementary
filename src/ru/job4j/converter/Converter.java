package ru.job4j.converter;

public class Converter {
    public static double rubleToEuro(int ruble){
        double conversion = (double)ruble / 70;
        return conversion;
    }
    public  static double rubleToDollar(int ruble){
        double conversion = (double) ruble / 60;
        return conversion;
    }
    public static void  main (String[] args){
        double dollar = Converter.rubleToDollar(130);
        double euro = Converter.rubleToEuro(140);
        System.out.println("130 ruble are " + dollar + " dollars ");
        System.out.println("140 ruble are " + euro + " euro");
    }
}
