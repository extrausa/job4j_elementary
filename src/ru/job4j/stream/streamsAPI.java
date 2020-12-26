package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//0. Stream API [#362892]
public class streamsAPI {



    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            array.add(i);
        }
        List<Integer> positiveNumbers = array.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        //positiveNumbers.forEach(n -> System.out.println(n));
        positiveNumbers.forEach(System.out :: println);

    }
}
