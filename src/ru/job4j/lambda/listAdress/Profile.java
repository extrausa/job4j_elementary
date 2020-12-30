package ru.job4j.lambda.listAdress;

import ru.job4j.lambda.phonebook.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//2. Список адресов [#362894]
public class Profile {
    private Adress adress;

    public Profile(Adress adress) {
        this.adress = adress;
    }

    public Adress getAdress() {
        return adress;
    }

    public List<Adress> collect(List<Profile> profiles){
        List<Adress> collect = profiles.stream()
                .map(Profile::getAdress)
                .collect(Collectors.toList());
        return collect;
    }


}
