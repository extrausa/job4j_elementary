package ru.job4j.tracker;
//0. Сортировка [#363056]
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        List<Item> items = new ArrayList<>();
        Item one = new Item();
        one.setName("Bob");
        one.setId(1);
        items.add(one);
        Item two = new Item();
        two.setName("Jack");
        two.setId(2);
        items.add(two);
        Comparator name = new ItemComparatorIncrease();
        Collections.sort(items, name);
        List<Item> items1 = new ArrayList<>();
        Item two1 = new Item();
        two1.setName("Jack");
        two1.setId(2);
        items1.add(two1);
        Item one1 = new Item();
        one1.setName("Bob");
        one1.setId(1);
        items1.add(one1);
        assertThat(items, is(items1));
    }


}