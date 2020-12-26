package ru.job4j.lambda.phonebook;

import java.util.ArrayList;
import java.util.function.Predicate;
//6. Функции высшего порядка [#362879]
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> surname = person -> person.getSurname().contains(key);
        Predicate<Person> name = person -> person.getName().contains(key);
        Predicate<Person> phone = person -> person.getPhone().contains(key);
        Predicate<Person> address = person -> person.getAddress().contains(key);
        Predicate<Person> combine =  surname.or(name);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
