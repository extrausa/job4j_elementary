package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//0. Stream API [#362892]
class StreamsAPI {



    public static void main(String[] args) {
        List<Integer> array = IntStream.range(0,21).boxed().collect(Collectors.toList());
        List<Integer> positiveNumbers = array.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        //positiveNumbers.forEach(n -> System.out.println(n));
        positiveNumbers.forEach(System.out :: println);

    }
}
