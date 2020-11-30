package ru.job4j.tracker;
//2. Рефакторинг - Шаблон Декоратор для валидатора. [#363096]
import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenGoodInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenOutputShowAllItems () {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"a", "0", "0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new ExitProgramm(out));
//        {
//                //new ShowAllItems(out),
//                new ExitProgramm(out)
//        };
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        new StartUI(out).init(new ValidateInput(out, in), tracker, actions);
        assertThat(out.toString(), Is.is(
                "Please enter validate data again." + System.lineSeparator() + "Menu."
                        + System.lineSeparator() + "0. Exit" + System.lineSeparator()));
    }



}