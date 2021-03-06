package ru.job4j.tracker;

import java.util.List;

//2. Singleton. [#363115]
public enum TrackerSingle {
    INSTANCE; /* здесь мы указываем перечисления. */


    Tracker track  = new Tracker();

    public Tracker getTrack() {
        return track;
    }

    public static void main(String[] args) {
        Tracker tracker = INSTANCE.getTrack();
        Tracker tracker1 = INSTANCE.getTrack();

        tracker.add(new Item("name1"));
        tracker1.add(new Item("name2"));
        List<Item> all = tracker.findAll();
        for (Item i : all) {
            System.out.println(i);
        }
//        for (int i = 0; i < all.length; i++) {
//            System.out.println(all[i]);
//        }



    }
}
