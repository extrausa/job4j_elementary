package ru.job4j.lambda;
//2.0. Встроенные функциональные интерфейсы. [#362886]
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class SearchAtt {

    private static List<Attachment> filter(Predicate<Attachment> first, List<Attachment> list ){
        List<Attachment> rsl = new ArrayList<Attachment>();
        for (Attachment att : list) {
            if (first.test(att)){
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> first = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                if (attachment.getSize() > 100) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        return filter(first, list);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> first = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                if (attachment.getName().contains("bug")) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        return filter(first, list);
    }
}
