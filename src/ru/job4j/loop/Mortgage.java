package ru.job4j.loop;
// 5.7. Ипотека [#363029]
// amount - сумма выданная по кредиту, salary - годовой доход, percent - процентная ставка по кредиту.
public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount >= 0) {
           amount = ((int) ((amount * (percent / 100)) + amount)) - salary;
            year++;
        }
        return year;
    }
}
