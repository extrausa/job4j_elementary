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
        Predicate<Person> combine =  surname -> persons.contains(key)  ;

        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
