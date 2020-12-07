package ru.job4j.collection;

import java.util.Comparator;

public class JobDescByNameDecrease implements Comparator<Job> {
    @Override
    public int compare(Job job, Job t1) {
        return t1.getName().compareTo(job.getName());
    }
}
