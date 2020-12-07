package ru.job4j.tracker;
//0. Сортировка [#363056]
import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

public class TrackerTest {

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item();
        bugWithDesc.setName("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }

    @Test
    public void whenIncrease() {
        Tracker tracker = new Tracker();

        Item bug = new Item();
        bug.setName("Bug 1");
        tracker.add(bug);
        Item dog = new Item();
        dog.setName("Dog 2");
        tracker.add(dog);
        Item mouse = new Item();
        mouse.setName("Mouse 3");
        tracker.add(mouse);
        Comparator itemIncrease = new ItemComparatorIncrease();
        Collections.sort(tracker.findAll(), itemIncrease);

        Tracker tracker1 = new Tracker();
        Item mouse1 = new Item();
        mouse1.setName("Mouse 3");
        mouse1.setId(3);
        tracker1.add(mouse1);
        Item dog1 = new Item();
        dog1.setName("Dog 2");
        dog1.setId(2);
        tracker1.add(dog1);
        Item bug1 = new Item();
        bug1.setName("Bug 1");
        bug1.setId(1);
        tracker1.add(bug1);

        assertThat(tracker.findById(1).getName(), is(tracker1.findById(3).getName()));
    }


}