package ru.job4j.lambda;

public class Attachment {
    private String name;
    private Integer size;

    public Attachment(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }
}
