package ru.job4j.tracker;

import java.util.List;

public class ShowAllItems implements UserAction {
    private final Output out;

    public ShowAllItems(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        //out.println(" === Show all Items ===");
        out.println("Show all Item");
        List<Item> items = tracker.findAll();
        for(Item i: items) {
            out.println(i.getName() + " - " + i.getId());
        }
//        for (int i = 0; i < items.length; i++) {
//            out.println(items[i].getName() + " - " + items[i].getId());
//        }
        return true;
    }
}
