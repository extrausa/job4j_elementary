package ru.job4j.tracker;

public class ExitProgramm implements UserAction {
    @Override
    public String name() {
        return " +++ EXIT +++";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
