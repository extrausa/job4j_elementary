package ru.job4j.lambda;
//EasyStream [#401629]
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AdditionalStreamAPI {
    private List<Integer> a = new ArrayList<>();

    public static AdditionalStreamAPI of(List<Integer> source) {
        AdditionalStreamAPI check = new AdditionalStreamAPI();
        for (Integer z : source) {
            check.a.add(z);
        }
        return check;
    }

    public AdditionalStreamAPI map(Function<Integer, Integer> fun) {
        AdditionalStreamAPI check = new AdditionalStreamAPI();
        for (Integer z : a) {
            check.a.add(fun.apply(z));
        }
        return check;
    }

    public AdditionalStreamAPI filter(Predicate<Integer> fun) {
        AdditionalStreamAPI check = new AdditionalStreamAPI();
        for (Integer z : a) {
            if (fun.test(z)) {
                check.a.add(z);
            } else {
                check.a.remove(z);
            }
        }
        return check;
    }

    public List<Integer> collect() {
        return a.stream().collect(Collectors.toList());
    }

}
