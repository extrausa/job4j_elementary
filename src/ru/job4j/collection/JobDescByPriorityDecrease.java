package ru.job4j.collection;

import java.util.Comparator;

public class JobDescByPriorityDecrease implements Comparator<Job> {
    @Override
    public int compare(Job job, Job t1) {
        return Integer.compare(t1.getPriority(), job.getPriority());
    }
}
