package ru.job4j.tracker;

//import java.util.Scanner;
//4.1. Разрыв зависимости StartUI от Scanner. [#363085]
import java.util.*;

//5. Tracker - хранилище [#363159]
//2.1. Реализация класса StartUI [#363091]
//4.2. Статические методы. [#363086]
//8. Реализация меню за счет шаблона стратегия. [#363087]
//9.1 Зависимость от System.out [#363077]
//1. Обеспечить бесперебойную работу приложения Tracker [#363106]

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }
//    public static void createItem(Input input, Tracker tracker) {
//        System.out.println("=== Create a new Item ===");
//        String name = input.askStr("Enter name: ");
//        Item item = new Item();
//        item.setName(name);
//        tracker.add(item);
//    }
//
//    public static void showAllItems(Input input, Tracker tracker) {
//        System.out.println("=== Show all items ===");
//        System.out.println("Show ");
//        Item[] items = tracker.findAll();
//        for (int i = 0; i < items.length; i++) {
//            System.out.println(items[i].getName() + " - " + items[i].getId());
//        }
//    }
//
//    public static void editItem(Input input, Tracker tracker) {
//        System.out.println("=== Edit item ===");
//        String name = input.askStr("input id ");
//        int numb = Integer.valueOf(name);
//        name = input.askStr("input Name");;
//        Item item = new Item();
//        item.setName(name);
//        tracker.replace(numb,item);
//        if (tracker.replace(numb,item)) {
//            System.out.println("re-saved");
//        } else {
//            System.out.println("NO re-saved");
//        }
//    }
//
//    public static void deleteItem(Input input, Tracker tracker) {
//        System.out.println("=== Delete item ===");
//        String name = input.askStr("input id ");
//        int numb = Integer.valueOf(name);
//        tracker.delete(numb);
//        if (tracker.delete(numb)) {
//            System.out.println("Deleted");
//        } else {
//            System.out.println("NOT Deleted");
//        }
//    }
//
//    public static void findeByIdItem(Input input, Tracker tracker) {
//        System.out.println("=== Find item by id ===");
//        String name = input.askStr("input find id ");
//        int numb = Integer.valueOf(name);
//        tracker.findById(numb);
//        Item items = tracker.findById(numb);
//        if (items != null) {
//            System.out.println(items.getName() + " - " + items.getId());
//        } else  {
//            System.out.println("items id NOT FOUND");
//        }
//    }
//
//    public static void findeByNameItem(Input input, Tracker tracker) {
//        System.out.println("=== Find item by name ===");
//        String name = input.askStr("input find name ");
//        tracker.findByName(name);
//        Item[] items = tracker.findByName(name);
//        if (items.length > 0) {
//            for (int i = 0; i < items.length; i++) {
//                System.out.println(items[i].getName() + " - " + items[i].getId());
//            }
//        } else  {
//            System.out.println("items name NOT FOUND");
//        }
//    }
//
//    public static void notFoundItem(Input input, Tracker tracker) {
//        System.out.println("Good bay");
//    }

    public  void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.set(select, actions.get(select));
            run = action.execute(input, tracker);

        }
//        while (run)
//            this.showMenu();
//            int select = Integer.valueOf(input.askStr("Select"));
//            if (select < 0 || select > 6) {
//                System.out.println("does not exist");
//            }
//            if (select == 0) {
//                StartUI.createItem(input, tracker);
//            } else if (select == 1) {
//                StartUI.showAllItems(input, tracker);
//            } else if (select == 2) {
//                StartUI.editItem(input, tracker);
//            } else if (select == 3) {
//                StartUI.deleteItem(input, tracker);
//            } else if (select == 4) {
//               StartUI.findeByIdItem(input, tracker);
//            } else if(select == 5) {
//                StartUI.findeByNameItem(input, tracker);
//            } else if (select == 6) {
//               StartUI.notFoundItem(input, tracker);
//            }
//
//        }
    }
    private void showMenu(List<UserAction> actions) {
        out.println("Menu.");
        for (int i = 0; i < actions.size(); i++) {
            out.println(i + ". " + actions.get(i).name());
        }
    }

//    private void showMenu() {
//        System.out.println("Menu.");
//        System.out.println("0. Add new Item");
//        System.out.println("1. Show all items");
//        System.out.println("2. Edit item");
//        System.out.println("3. Delete item");
//        System.out.println("4. Find item by Id");
//        System.out.println("5. Find items by name");
//        System.out.println("6. Exit Program");
//    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction(output));
        actions.add(new ShowAllItems(output));
        actions.add(new EditItem(output));
        actions.add(new DeletedItem(output));
        actions.add(new FindeByNameItem(output));
        actions.add(new FindeByIdItem(output));
        actions.add(new ExitProgramm(output));
        //        List<UserAction> actions = {
//                new CreateAction(output),
//                new ShowAllItems(output),
//                new EditItem(output),
//                new DeletedItem(output),
//                new FindeByNameItem(output),
//                new FindeByIdItem(output),
//                new ExitProgramm(output)
//
//
//        };
        new StartUI(output).init(input, tracker, actions);
        //new StartUI().init(input, tracker);


    }

}
