package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ads = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ads++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if(item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] resultArray = new Item[size];
        int number = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item != null) {
                resultArray[number] = item;
                number++;
            }
        }
        resultArray = Arrays.copyOf(resultArray, number);
        return resultArray;
    };

    public Item[] findByName(String key) {
        Item[] resultItems = new Item[size];
        int number = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getName() == key) {
                resultItems[number] = item;
                number++;
            }
        }
        resultItems = Arrays.copyOf(resultItems,number);
        return resultItems;
    }
}
