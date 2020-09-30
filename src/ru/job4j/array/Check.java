package ru.job4j.array;
//6.3. Массив заполнен true или false [#362941]
public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = false;
        int suummTrue = 0;
        int sumnFalse = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i]) {
                suummTrue++;
            } else {
                sumnFalse++;

            }

        }
        if (suummTrue == data.length || sumnFalse == data.length) {
            result = true;
        }
        return result;

    }
}
