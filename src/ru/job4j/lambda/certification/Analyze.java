package ru.job4j.lambda.certification;
//2. Аттестация [#362910]
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//2. Аттестация [#362910]
public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .average()
                .orElse(Double.MAX_VALUE);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(pupil.getName(), pupil.getSubjects()
                        .stream()
                        .mapToInt(Subject::getScore)
                        .average()
                        .orElse(Double.MAX_VALUE)))
                .collect(Collectors.toList());
      }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, Collectors.averagingDouble(Subject::getScore)))
                .entrySet().stream()
        .map(stringDoubleEntry -> new Tuple(stringDoubleEntry.getKey(), stringDoubleEntry.getValue()))
        .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(pupil.getName(), pupil.getSubjects()
                        .stream()
                        .mapToInt(Subject::getScore)
                        .sum()))
                .max(Comparator.comparing(tuple -> tuple.getScore()))
                .orElse(null);

    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, Collectors.summingDouble(Subject::getScore)))
                .entrySet().stream()
                .map(stringDoubleEntry -> new Tuple(stringDoubleEntry.getKey(), stringDoubleEntry.getValue()))
                .max(Comparator.comparing(Tuple::getScore))
                .orElse(null);
    }
}
