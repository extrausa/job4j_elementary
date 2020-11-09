package ru.job4j.tracker;

public class DeletedItem implements UserAction{
    @Override
    public String name() {
        return " === Delete Item === ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
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
