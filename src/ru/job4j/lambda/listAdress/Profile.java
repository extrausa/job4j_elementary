package ru.job4j.lambda.listAdress;

import ru.job4j.lambda.phonebook.Person;
//3. Уникальность элементов и сортировка. [#362895]
import java.util.*;
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

    public static List<Adress> collect(List<Profile> profiles){
        List<Adress> collect = profiles.stream()
                .map(Profile::getAdress)
                .sorted(Comparator.comparing(Adress::getCity))
                //.sorted(new AdressComparator())
                .distinct()
                .collect(Collectors.toList());
        return collect;
    }


}
