package ru.job4j.collection;
//5. Конвертация листа массивов в один лист Integer [#363062]
import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] row : list) {
            for (int cell : row) {
                rsl.add(cell);
            }
        }
        return rsl;
    }
}
