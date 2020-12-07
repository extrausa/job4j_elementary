package ru.job4j.tracker;
//6. Метод замены заявки. Tracker.replace [#363155]
//7. Метод удаления заявки Tracker.delete [#363156]
//8. Что такое валидация? [#363157]
import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tracker {
    //private final Item[] items = new Item[100];
    private final List<Item> items = new ArrayList<>();
    //private TrackerSingle trackerSingle = new TrackerSingle();

    private int ads = 1;
    //private int size = items.size();

    public Item add(Item item) {
        item.setId(ads++);
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
        //return index != -1 ? items[index] : null;
    }

    public List<Item> findAll() {
        return items;

//        int number = 0;
//        for (int i = 0; i < size; i++) {
//            Item item = items[i];
//            if (item != null) {
//                resultArray[number] = item;
//                number++;
//            }
//        }
        //return Arrays.copyOf(items, size);



    }

    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item i : items) {
            if (i.getName().equals(key)){
                result.add(i);
            }
        }
        return result;
//        int number = 0;
//        for (int i = 0; i < size; i++) {
//            Item item = items[i];
//            if (item.getName().equals(key)) {
//                resultItems[number] = item;
//                number++;
//            }
//        }
//        return Arrays.copyOf(resultItems,number);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;

    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (index != -1) {
            items.set(index, item);
            item.setId(id);
//            items[index] = item;
//            items[index].setId(id);
            result = true;
        }

        return result;

    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (index != -1){
//            items[index] = null;
//            System.arraycopy(items, index + 1, items, index, size - index);
//            items[size - 1] = null;
//            size--;
            items.remove(index);
        }

        return rsl;
    }

}
