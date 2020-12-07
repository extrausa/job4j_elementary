package ru.job4j.tracker;

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
        int bugId = bug.getId();
        int dogId = dog.getId();
        int mouseId = mouse.getId();
        assertThat(tracker.findById(mouseId).getName(), is("Mouse 3"));
    }


}