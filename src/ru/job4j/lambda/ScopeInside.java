package ru.job4j.lambda;
//4. Зона видимости в лямбда-выражениях и исключения [#362882]
import java.util.function.Supplier;

public class ScopeInside {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            int num = i;
            int finalTotal = total;
            total = add(
                    () -> {
                            return number[num] += finalTotal;
                    }
            );
        }
        System.out.println(total);
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}
