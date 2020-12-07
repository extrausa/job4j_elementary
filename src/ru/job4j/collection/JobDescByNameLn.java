package ru.job4j.collection;

import java.util.Comparator;

public class JobDescByNameLn implements Comparator<Job> {
    @Override
    public int compare(Job job, Job t1) {
        return Integer.compare(t1.getName().length(), job.getName().length());
    }
}
