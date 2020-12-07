package ru.job4j.tracker;

import java.util.Comparator;

public class ItemComparatorIncrease implements Comparator<Item> {
    @Override
    public int compare(Item item, Item t1) {
        return t1.getId() - item.getId();
    }
}
