package ru.job4j.tracker;

import java.util.List;

public class TrackerSingleEager {

    private static final Tracker INSTANCE = new Tracker();



    private TrackerSingleEager() {
    }

    public static Tracker getInstance() {

        return INSTANCE;
    }



    public static void main(String[] args) {

        Tracker tracker = TrackerSingleEager.getInstance();
        Tracker tracker1 = TrackerSingleEager.getInstance();

        tracker.add(new Item("name1"));
        tracker1.add(new Item("name2"));
        List<Item> all = tracker.findAll();
        for (Item i : all) {
            System.out.println(i);
        }
    }
}
