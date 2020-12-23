package ru.job4j.lambda;
//3. Ссылки на методы [#362881]
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class RefMethod {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ivan",
                "Petr Arsentev"
        );
        Consumer<String> out = RefMethod::cutOut;
    }

    public static void cutOut(String value) {
        if (value.length() > 10) {
            System.out.println(value.substring(0, 10) + "..");
        } else {
            System.out.println(value);
        }
    }
}
