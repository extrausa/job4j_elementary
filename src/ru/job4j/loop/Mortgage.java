package ru.job4j.loop;
// 5.7. Ипотека [#363029]
// amount - сумма выданная по кредиту, salary - годовой доход, percent - процентная ставка по кредиту.
public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        double ostatok = 0;
        double percentOne = percent / 100;
        double amountYear = (amount * percentOne) + amount;
        while (salary < amountYear) {
           amountYear = amountYear - salary;
           year++;
        }

        return year;

    }
}
