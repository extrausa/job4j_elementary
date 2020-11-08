package ru.job4j.tracker;
//Класс Item описывает модель заявления.
//Поле id - это уникальный номер заявления.
//Поле name содержит название заявления.
public class Item {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
