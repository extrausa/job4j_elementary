package ru.job4j.tracker;

public class TrackerSingleLazyLoading {
    private TrackerSingleLazyLoading() {
    }

    public static Tracker getInstance() {

        return Holder.INSTANCE;
    }



    private static final class Holder {
        private static final Tracker INSTANCE = new Tracker();
    }

    public static void main(String[] args) {
        Tracker tracker = TrackerSingleLazyLoading.getInstance();
        Tracker tracker1 = TrackerSingleLazyLoading.getInstance();

        tracker.add(new Item("name1"));
        tracker1.add(new Item("name2"));
        Item[] all = tracker.findAll();
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }


}
