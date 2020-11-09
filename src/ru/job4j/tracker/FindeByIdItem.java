package ru.job4j.tracker;

public class FindeByIdItem implements UserAction {
    @Override
    public String name() {
        return "=== Find item by id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("input find id ");
        int numb = Integer.valueOf(name);
        tracker.findById(numb);
        Item items = tracker.findById(numb);
        if (items != null) {
            System.out.println(items.getName() + " - " + items.getId());
            return true;
        } else  {
            System.out.println("items id NOT FOUND");
            return false;
        }

    }
}
