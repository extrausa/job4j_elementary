package ru.job4j.array;
//6.3. Массив заполнен true или false [#362941]
public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != data[0]) {
                result = false;
                break;
            }
        }
        return result;

    }
}
