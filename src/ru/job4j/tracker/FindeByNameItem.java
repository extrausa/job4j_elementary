package ru.job4j.tracker;

public class FindeByNameItem implements UserAction {
    private final Output out;

    public FindeByNameItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by name ===");
        String name = input.askStr("input find name ");
        tracker.findByName(name);
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                out.println(items[i].getName() + " - " + items[i].getId());

            }
        } else  {
            out.println("items name NOT FOUND");
        }

        return true;
    }
}
