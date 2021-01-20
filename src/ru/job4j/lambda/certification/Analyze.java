package ru.job4j.lambda.certification;

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
        double average = averageScore(stream);
        return stream
                .map(pupil -> new Tuple(pupil.getName(),average))
                .collect(Collectors.toList());
    }

//    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
//
//
//    }

//    public static Tuple bestStudent(Stream<Pupil> stream) {
//
//    }

//    public static Tuple bestSubject(Stream<Pupil> stream) {
//        return null;
//    }
}
