package ru.job4j.lambda.listAdress;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static ru.job4j.lambda.listAdress.Profile.collect;

public class ProfileTest {
    @Test
    public void listAdress(){

        List<Profile> one = new ArrayList<>();
        one.add(new Profile(new Adress("krd","Mira", 121,223)));
        one.add(new Profile(new Adress("msc","Stasova", 11,23)));
        one.add(new Profile(new Adress("perm","Zapadnaya", 12,22)));
        one.add(new Profile(new Adress("ast","40 let", 141,32)));
        List<Adress> two = collect(one);
        List<Adress> eq = new ArrayList<>();
        eq.add(new Adress("krd","Mira", 121,223));
        eq.add(new Adress("msc","Stasova", 11,23));
        eq.add(new Adress("perm","Zapadnaya", 12,22));
        eq.add(new Adress("ast","40 let", 141,32));
        eq.sort(Comparator.comparing(Adress::getCity));
        assertThat(two, is(eq));







    }


}