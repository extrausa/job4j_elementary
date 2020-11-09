package ru.job4j.tracker;

public class EditItem implements UserAction {
    private final Output out;

    public EditItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println(" === Edit Item === ");
        String name = input.askStr("input id ");
        int numb = Integer.valueOf(name);
        name = input.askStr("input Name");;
        Item item = new Item();
        item.setName(name);
        tracker.replace(numb,item);
        if (tracker.replace(numb,item)) {
            out.println("re-saved");
        } else {
            out.println("NO re-saved");
        }
        return true;
    }
}
