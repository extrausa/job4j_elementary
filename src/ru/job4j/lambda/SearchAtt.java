package ru.job4j.lambda;
//2.0. Встроенные функциональные интерфейсы. [#362886]
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class SearchAtt {

    private static List<Attachment> filter(UnaryOperator<Attachment> first, List<Attachment> list ){
        List<Attachment> rsl = new ArrayList<Attachment>();
        for (Attachment att : list) {
            rsl.add(first.apply(att));
        }
        return rsl;
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        UnaryOperator<Attachment> first = new UnaryOperator<Attachment>() {
            @Override
            public Attachment apply(Attachment o) {
                if (o.getSize() > 100) {
                    return o;
                } else {
                    o.setName("CSSs");
                }
                return o;
            }
        };
        return filter(first, list);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
      UnaryOperator<Attachment> first = new UnaryOperator<Attachment>() {
            @Override
            public Attachment apply(Attachment o) {
                if (o.getName().contains("bug")) {
                    return o;
                }
                return null;
            }
        };
        return filter(first, list);
    }
}
