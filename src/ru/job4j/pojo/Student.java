package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String name;
    private String surname;
    private String middleName;
    private int group;
    private int yearStartStudy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getYearStartStudy() {
        return yearStartStudy;
    }

    public void setYearStartStudy(int startStudy) {
        this.yearStartStudy = startStudy;
    }
}
