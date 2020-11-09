package ru.job4j.tracker;

public class ShowAllItems implements UserAction {
    @Override
    public String name() {
        return " === Show all Items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Show ");
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].getName() + " - " + items[i].getId());
        }
        return true;
    }
}
