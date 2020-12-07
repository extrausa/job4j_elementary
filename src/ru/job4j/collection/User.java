package ru.job4j.collection;
//1. Организовать сортировку User [#363054]
import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(User user) {
        int rsl = this.name.compareTo(user.name);
//        if (rsl == 0) {
//            return Integer.compare(this.age, user.age);
//        } else {
//            return rsl;
//        }
        return rsl == 0 ? Integer.compare(this.age, user.age) : rsl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
