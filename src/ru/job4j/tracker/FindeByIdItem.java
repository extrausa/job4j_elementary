package ru.job4j.tracker;

public class FindeByIdItem implements UserAction {
    private final Output out;

    public FindeByIdItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by id ===");
        String name = input.askStr("input find id ");
        int numb = Integer.valueOf(name);
        tracker.findById(numb);
        Item items = tracker.findById(numb);
        if (items != null) {
            out.println(items.getName() + " - " + items.getId());
        } else  {
            out.println("items id NOT FOUND");
        }
        return true;

    }
}
