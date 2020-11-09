package ru.job4j.tracker;

public class ExitProgramm implements UserAction {
    private final Output out;

    public ExitProgramm(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Exit";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("Exit");
        return false;
    }
}
