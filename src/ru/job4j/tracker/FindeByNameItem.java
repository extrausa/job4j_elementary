package ru.job4j.tracker;

public class FindeByNameItem implements UserAction {
    @Override
    public String name() {
        return "=== Find item by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("input find name ");
        tracker.findByName(name);
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i].getName() + " - " + items[i].getId());

            }
        } else  {
            System.out.println("items name NOT FOUND");
              return false;
        }

        return true;
    }
}
