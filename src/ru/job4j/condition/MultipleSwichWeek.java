package ru.job4j.condition;

import javax.swing.*;

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

    public static int calculate(int[] hours) {
        int dayoOffEightClock = 0;
        int dayoOffEightClockUp = 0;
        int workingDayEightClock = 0;
        int workingDayEightClockUp = 0;
        int summ = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i > 4) {
                if (hours[i] <= 8) {
                    //dayoOffEightClock += hours[i] * 20;
                    summ += hours[i] * 20;

                } else {
                    //dayoOffEightClockUp += (hours[i] - 8) * 30;
                    summ += (hours[i] - 8) * 30;
                    //dayoOffEightClock += 8 * 20;
                    summ += 8 * 20;
                }
            } else {
                if (hours[i] <= 8) {
                    //workingDayEightClock += hours[i] * 10;
                    summ += hours[i] * 10;

                } else {
                    //workingDayEightClockUp += (hours[i] - 8) * 15;
                    summ += (hours[i] - 8) * 15;
                    //workingDayEightClock += 8 * 10;
                    summ += 8 * 10;

                }
            }
        }
        //return dayoOffEightClock + dayoOffEightClockUp + workingDayEightClock + workingDayEightClockUp;
        return summ;
//        int hoursJob = hours[0] + hours[1] + hours[2] + hours[3] + hours[4];
//        int monday = hours[0];
//        int moneyone = 0;
//        int moneytwo = 0;
//        int holiday = 0;
//        int holidayUp = 0;
//        if (monday <= 8) {
//            moneyone = monday;
//        } else {
//            moneytwo = (monday - 8);
//            moneyone = 8;
//        }
//        int tuesday = hours[1];
//        if (tuesday <= 8) {
//            moneyone += tuesday;
//        } else {
//            moneytwo += (tuesday - 8);
//            moneyone += 8;
//        }
//        int wednesday = hours[2];
//        if (wednesday <= 8) {
//            moneyone += wednesday;
//        } else {
//            moneytwo += (wednesday - 8);
//            moneyone += 8;
//        }
//        int thursday = hours[3];
//        if (thursday <= 8) {
//            moneyone += thursday;
//        } else {
//            moneytwo += (thursday - 8);
//            moneyone += 8;
//        }
//        int friday = hours[4];
//        if (friday <= 8) {
//            moneyone += friday;
//        } else {
//            moneytwo += (friday - 8);
//            moneyone += 8;
//        }
//        int saturday = hours[5];
//        if (saturday <= 8) {
//            holiday = saturday;
//        } else {
//            holidayUp = (saturday - 8);
//            holiday = 8;
//        }
//        int sunday = hours[6];
//        if (sunday <= 8) {
//            holiday += sunday;
//        } else {
//            holidayUp += (sunday - 8);
//            holiday += 8;
//        }
//
//        return (moneyone * 10) + (holiday * 20) + (holidayUp * 30) + (moneytwo * 15);

    }

    public static void main(String[] args) {
//        int numberDay = MultipleSwichWeek.numberOfDay("понедельник");
//        System.out.println(numberDay);
        int[] time = {10, 0, 12, 0, 8, 12, 4};
        //int[] time = {8, 8, 8, 8, 8, 0, 0};
        int cash = MultipleSwichWeek.calculate(time);
        System.out.println(cash);
    }

}
