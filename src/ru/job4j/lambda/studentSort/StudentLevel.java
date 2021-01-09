package ru.job4j.lambda.studentSort;
//0. Stream API улучшения [#362903]
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound){
        return students.stream()
                .filter(Objects::nonNull) // Objects::nonNull
                .sorted((left, right) -> left.toString().compareTo(right.toString()))
                .takeWhile(student -> student.getScore() > bound)
                .collect(Collectors.toList());
    }
}
