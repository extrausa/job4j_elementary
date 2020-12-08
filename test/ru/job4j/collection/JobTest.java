package ru.job4j.collection;
//2. Комбинированный компаратор [#363055]

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByName() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("Faix bug", 2),
                new Job("Faixr bug", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndProrityDecrease() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriorityDecrease());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 3),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(1));
    }

    @Test
    public void whenCompatorByNameDecrease() {
        Comparator<Job> cmpNamePriority = new JobDescByNameDecrease();
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Fax bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }



}