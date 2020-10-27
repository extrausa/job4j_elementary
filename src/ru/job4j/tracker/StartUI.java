package ru.job4j.tracker;
//5. Tracker - хранилище [#363159]
public class StartUI {
    public static void main(String[] args) {
        Tracker one = new Tracker();
        Item book = new Item();
        book.setName("Strong");
        Item table = new Item();
        table.setName("Four legs");
        one.add(book);
        one.add(table);
        System.out.println(one.findById(1).getName() + " - " + one.findById(1).getId());
        System.out.println(one.findById(2).getName() + " - " + one.findById(2).getId());


        }



}
