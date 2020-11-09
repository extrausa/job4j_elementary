package ru.job4j.tracker;

public class DeletedItem implements UserAction{

    private final Output out;

    public DeletedItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println(" === Delete Item === ");
        String name = input.askStr("input id ");
        int numb = Integer.valueOf(name);
        tracker.delete(numb);
        if (tracker.delete(numb)) {
            System.out.println("Deleted");
            return true;
        } else {
            System.out.println("NOT Deleted");
            return false;
        }
    }
}
