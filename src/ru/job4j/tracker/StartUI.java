package ru.job4j.tracker;

//import java.util.Scanner;
//4.1. Разрыв зависимости StartUI от Scanner. [#363085]
import java.util.Scanner;

//5. Tracker - хранилище [#363159]
//2.1. Реализация класса StartUI [#363091]
public class StartUI {
    public  void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select"));
            if (select < 0 || select > 6) {
                System.out.println("does not exist");
            }
            if (select == 6) {
                System.out.println("Good bay");
                break;
            }
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                String name = input.askStr("Enter name: ");
                Item item = new Item();
                item.setName(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                System.out.println("Show ");
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i].getName() + " - " + items[i].getId());
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                String name = input.askStr("input id ");
                int numb = Integer.valueOf(name);
                name = input.askStr("input Name");;
                Item item = new Item();
                item.setName(name);
                tracker.replace(numb,item);
                if (tracker.replace(numb,item)) {
                    System.out.println("re-saved");
                } else {
                    System.out.println("NO re-saved");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                String name = input.askStr("input id ");
                int numb = Integer.valueOf(name);
                tracker.delete(numb);
                if (tracker.delete(numb)) {
                    System.out.println("Deleted");
                } else {
                    System.out.println("NOT Deleted");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by id ===");
                String name = input.askStr("input find id ");
                int numb = Integer.valueOf(name);
                tracker.findById(numb);
                Item items = tracker.findById(numb);
                if (items != null) {
                    System.out.println(items.getName() + " - " + items.getId());
                } else  {
                    System.out.println("items id NOT FOUND");
                }
            } else if(select == 5) {
                System.out.println("=== Find item by name ===");
                String name = input.askStr("input find name ");
                tracker.findByName(name);
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (int i = 0; i < items.length; i++) {
                        System.out.println(items[i].getName() + " - " + items[i].getId());
                    }
                } else  {
                    System.out.println("items name NOT FOUND");
                }
            } else if (select == 6) {
                run = false;
            }

        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);


    }

}
