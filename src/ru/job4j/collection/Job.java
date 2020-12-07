package ru.job4j.collection;

import java.util.Comparator;
import java.util.Objects;

public class Job implements Comparable<Job> {
    private String name;

    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{" + name + ", " + priority + '}';
    }

    @Override
    public int compareTo(Job job) {
        int rsl = this.name.compareTo(job.name);
        return rsl == 0 ? Integer.compare(this.priority, job.getPriority()) : rsl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return priority == job.priority &&
                Objects.equals(name, job.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority);
    }
}
