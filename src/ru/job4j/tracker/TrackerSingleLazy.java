package ru.job4j.tracker;
//2. Singleton. [#363115]
public class TrackerSingleLazy {
    private static Tracker instance;

    private TrackerSingleLazy() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

    public static void main(String[] args) {
        Tracker tracker = TrackerSingleLazy.getInstance();
        Tracker tracker1 = TrackerSingleLazy.getInstance();

        tracker.add(new Item("name3"));
        tracker1.add(new Item("name4"));
        Item[] all = tracker.findAll();
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }

}

