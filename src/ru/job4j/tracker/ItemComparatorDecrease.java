package ru.job4j.tracker;

import java.util.Comparator;

public class ItemComparatorDecrease implements Comparator<Item> {
    @Override
    public int compare(Item item, Item t1) {
        return item.getId() - t1.getId();
    }
}
