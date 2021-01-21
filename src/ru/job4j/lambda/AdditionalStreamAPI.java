package ru.job4j.lambda;
//EasyStream [#401629]
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AdditionalStreamAPI {
    private List<Integer> listInteger = new ArrayList<>();

    public static AdditionalStreamAPI of(List<Integer> source) {
        AdditionalStreamAPI check = new AdditionalStreamAPI();
        for (Integer z : source) {
            check.listInteger.add(z);
        }
        return check;
    }

    public AdditionalStreamAPI map(Function<Integer, Integer> fun) {
        AdditionalStreamAPI check = new AdditionalStreamAPI();
        for (Integer z : listInteger) {
            check.listInteger.add(fun.apply(z));
        }
        return check;
    }

    public AdditionalStreamAPI filter(Predicate<Integer> fun) {
        AdditionalStreamAPI check = new AdditionalStreamAPI();
//        return check.listInteger.stream()
//                .filter(integer -> fun.test(integer))
//                .findFirst();
        for (Integer z : listInteger) {
            if (fun.test(z)) {
                check.listInteger.add(z);
            }
        }
        return check;
    }

    public List<Integer> collect() {
        return listInteger.stream().collect(Collectors.toList());
    }

}
