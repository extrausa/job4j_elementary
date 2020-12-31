package ru.job4j.lambda.listAdress;

import java.util.Comparator;

public class AdressComparator implements Comparator<Adress> {
    @Override
    public int compare(Adress adress, Adress t1) {
        return adress.getCity().compareTo(t1.getCity());
    }
}
