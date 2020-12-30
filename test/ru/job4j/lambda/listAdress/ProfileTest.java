package ru.job4j.lambda.listAdress;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ProfileTest {
    @Test
    public void listAdress(){

        List<Profile> one = new ArrayList<>();
        one.add(new Profile(new Adress("Mira", 121,223)));
        one.add(new Profile(new Adress("Stasova", 11,23)));
        one.add(new Profile(new Adress("Zapadnaya", 12,22)));
        one.add(new Profile(new Adress("40 let", 141,32)));







    }


}