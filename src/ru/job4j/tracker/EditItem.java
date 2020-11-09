package ru.job4j.tracker;

public class EditItem implements UserAction {
    @Override
    public String name() {
        return " === Edit Item === ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("input id ");
        int numb = Integer.valueOf(name);
        name = input.askStr("input Name");;
        Item item = new Item();
        item.setName(name);
        tracker.replace(numb,item);
        if (tracker.replace(numb,item)) {
            System.out.println("re-saved");
            return true;
        } else {
            System.out.println("NO re-saved");
            return false;
        }
        //return true;
    }
}
