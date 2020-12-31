package ru.job4j.lambda.studentSort;
//1. Фильтрация учеников [#362893]
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict){
        return students.stream()
                .filter(predict)
                .collect(Collectors.toList());
    }

    public Map<String, Student> mapCollect(List<Student> students, Predicate<Student> predict){
        return students.stream()
                .filter(predict)
                .distinct().collect(
                        Collectors.toMap(
                                Student::getSurname,
                                Function.identity()
                                )
                );
    }
}
