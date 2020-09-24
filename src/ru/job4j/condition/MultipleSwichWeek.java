package ru.job4j.condition;
//4.6.2. Switch - matcher [#362929]
public class MultipleSwichWeek {

    public static int numberOfDay(String day) {
        return switch (day) {
            case "понедельник", "Monday" -> 1;
            case "вторник", "Tuesday" -> 2;
            case "среда", "Wednesday" -> 3;
            case "четверг", "Thursday" -> 4;
            case "пятница", "Friday" -> 5;
            case "суббота", "Saturday" -> 6;
            case "воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        int numberDay = MultipleSwichWeek.numberOfDay("понедельник");
        System.out.println(numberDay);
    }

}
