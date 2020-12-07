package ru.job4j.collection;

import java.lang.reflect.Array;
import java.util.*;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> job = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Comparator<Job> comb = new JobDescByName()
                .thenComparing(new JobDescByPriority())
                .thenComparing(new JobDescByNameLn());
        Collections.sort(job, comb);
        System.out.println(job);
    }
}
