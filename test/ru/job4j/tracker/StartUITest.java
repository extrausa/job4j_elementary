package ru.job4j.tracker;
//5. Input и полиморфизм. [#363083]
//5.1. Тестирование. Подготовка данных. [#363088]
//9. Написать тесты на StartUI. [#363092]
import org.junit.Test;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "1", "2"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ShowAllItems(),
                new ExitProgramm()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();

        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Replaced item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        String replacedName = "New item name";
        String id = Integer.toString(item.getId());
        Input in = new StubInput(
                new String[] {"0","Replaced item","1", id, replacedName, "2", "3" }

        );
        UserAction[] actions = {
                new CreateAction(),
                new EditItem(),
                new ShowAllItems(),
                new ExitProgramm()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Deleted item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        String id = Integer.toString(item.getId());
        Input in = new StubInput(
                new String[] {"0", "Deleted item", "1", id, "1"}
        );
        UserAction[] actions = {
                new CreateAction(),
                new DeletedItem(),
                new ExitProgramm()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

//    @Test
//    public void whenAddItem() {
//        String[] answers = {"Fix PC"};
//        Input input = new StubInput(answers);
//        Tracker tracker = new Tracker();
//        StartUI.createItem(input, tracker);
//        Item created = tracker.findAll()[0];
//        Item expected = new Item();
//        expected.setName("Fix PC");
//        assertThat(created.getName(), is(expected.getName()));
//    }
//
//    @Test
//    public void whenReplaceItem() {
//        Tracker tracker = new Tracker();
//        Item item = new Item();
//        item.setName("new item");
//        tracker.add(item);
//        String[] answers = {
//                Integer.toString(item.getId()),
//                "replaced item"
//        };
//        StartUI.editItem(new StubInput(answers), tracker);
//        Item replaced = tracker.findById(item.getId());
//        assertThat(replaced.getName(), is("replaced item"));
//    }
//
//    @Test
//    public void whenDeletItem() {
//        Tracker tracker = new Tracker();
//        Item item = new Item();
//        item.setName("new item");
//        tracker.add(item);
//        String[] answers = {
//                Integer.toString(item.getId())
//        };
//        StartUI.deleteItem(new StubInput(answers), tracker);
//        Item deleted = tracker.findById(item.getId());
//        assertThat(deleted, is(nullValue()));
//
//
//    }
}