package ru.job4j.converter;
//0. Что такое тестирование [#363002]
public class Converter {
    public static int rubleToEuro(int ruble) {
        int conversion = ruble / 70;
        return conversion;
    }

    public  static int rubleToDollar(int ruble) {
        int conversion = ruble / 60;
        return conversion;
    }

    public static void  main(String[]args) {
        int inDollar = 120;
        int inEuro  = 140;
        int expected = 2;
        int dollar = Converter.rubleToDollar(inDollar);
        boolean passed = dollar == expected;
        double euro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = euro == expected;
        System.out.println("140 ruble are " + dollar + " dollars " + "Test result = " + passed);
        System.out.println("140 ruble are " + euro + " euro " + "Test result = " + passedEuro);
    }
}
