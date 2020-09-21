package ru.job4j.condition;
//9.1. String [#362981]
public class Greeting {
    public static void main(String[] args){
        String idea = "I Like Java!";
        System.out.println(idea);
        idea += " But I am a newbie.";
        System.out.println(idea);
        int year = 2020;
        idea += year;
        System.out.println(idea);
    }
}
