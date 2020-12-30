package ru.job4j.lambda.listAdress;

import java.util.Objects;

public class Adress {
    private String street;
    private int home;
    private int apartment;

    public Adress(String street, int home, int apartment) {
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    public String getStreet() {
        return street;
    }

    public int getHome() {
        return home;
    }

    public int getApartment() {
        return apartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return home == adress.home &&
                apartment == adress.apartment &&
                Objects.equals(street, adress.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, home, apartment);
    }
}
