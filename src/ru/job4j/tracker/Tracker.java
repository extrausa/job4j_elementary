package ru.job4j.tracker;
//6. Метод замены заявки. Tracker.replace [#363155]
//7. Метод удаления заявки Tracker.delete [#363156]
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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
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
        return Arrays.copyOf(resultArray, number);


    };

    public Item[] findByName(String key) {
        Item[] resultItems = new Item[size];
        int number = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getName().equals(key)) {
                resultItems[number] = item;
                number++;
            }
        }
        return Arrays.copyOf(resultItems,number);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = false;
        if (index == -1) {
            result = false;
        }
        if (items[index].getId() == id) {
            items[index] = item;
            items[index].setId(id);
            result = true;
        }

        return result;
    }

    public boolean delete(int id) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index > items.length || index < 0){
            rsl = false;
        }
        items[index] = null;
        System.arraycopy(items, index + 1, items, index, size - index);
        items[size - 1] = null;
        size--;
        return rsl;
    }

}
