package ru.job4j.array;
//.6.9. Жадный алгоритм. Сдача в кофе машине [#362939]
//В этом задании нужно реализовать механизм возврата монет в лендинговых аппаратах.
//У вас есть купюра 50, 100 рублей. Вы хотите купить кофе за 35 рублей. Если вы засунули 50 рублей, то автомат должен вернут 15 рублей (монетами 10 и 5).
//Автомат может вернуть только монеты.
import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};
    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int chenge = money - price;
        for (int i = 0; i < COINS.length; i++) {
            while (chenge >= COINS[i]) {
                  rsl[size] = COINS[i];
                  chenge -= COINS[i];
                  size++;
            }
        }
        return Arrays.copyOf(rsl, size);

    }
}