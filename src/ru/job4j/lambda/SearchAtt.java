package ru.job4j.lambda;
//2.0. Встроенные функциональные интерфейсы. [#362886]
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class SearchAtt {

    private static List<Attachment> filter(UnaryOperator<Attachment> first ){
        List<Attachment> rsl = first;
        for (Attachment att : first) {
            rsl = first.apply(att);
        }

        return rsl;


    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        List<Attachment> rsl = new ArrayList<Attachment>();
        UnaryOperator<Attachment> first = new UnaryOperator<Attachment>() {
            @Override
            public Attachment apply(Attachment o) {
                if (o.getSize() > 100) {
                    return rsl.add(o);
                }
                return null;
            }
        };
        return filter(first);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        List<Attachment> rsl = new ArrayList<Attachment>();
      UnaryOperator<Attachment> first = new UnaryOperator<Attachment>() {
            @Override
            public Attachment apply(Attachment o) {
                if (o.getName().contains("bug")) {
                    return rsl.add(o);
                }
                return null;
            }
        };
        return filter(first);
    }


}
