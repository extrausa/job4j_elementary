package ru.job4j.tracker;

import java.util.Comparator;
import java.util.Objects;

//Класс Item описывает модель заявления.
//Поле id - это уникальный номер заявления.
//Поле name содержит название заявления.
public class Item {

    private int id;
    private String name;

    public Item() {

    }

    public Item(String name) {
        this.name = name;
    }



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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id &&
                Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
