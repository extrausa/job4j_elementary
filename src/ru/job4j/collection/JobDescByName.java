package ru.job4j.collection;

import java.util.Comparator;

public class JobDescByName implements Comparator<Job> {
    @Override
    public int compare(Job job, Job t1) {
        int rsl = job.getName().compareTo(t1.getName());

        return rsl;
    }
}
