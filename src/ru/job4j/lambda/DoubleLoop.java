package ru.job4j.lambda;
//8. Перенос методов в Stream API [#362900]
import java.util.Arrays;
import java.util.stream.Stream;

public class DoubleLoop {
    public enum Suit {
        Diamonds, Hearts, Spades, Clubs
    }

    public enum Value {
        V_6, V_7, V_8
    }

    public static class Card {
        private Suit suit;
        private Value value;

        public Card(Suit suit, Value value) {
            this.suit = suit;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Card{" +
                    "suit=" + suit +
                    ", value=" + value +
                    '}';
        }
    }

    public static void main(String[] args) {
//        String[] levels = {"level 1", "level 2", "level 3"};
//        String[] tasks = {"task 1", "task 2", "task 3", "task 4"};
//        for (String level : levels) {
//            for (String task : tasks) {
//                System.out.println(level + " " + task);
//            }
//        }
//        Stream.of(levels)
//                 .flatMap(level -> Stream.of(tasks)
//                 .map(task -> level + " " + task))
//                .forEach(System.out::println);
        for (Suit su : Suit.values()) {
            for (Value va : Value.values()){
                System.out.println(su + " - " + va);
            }
        }

        Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Value.values())
                .map(value -> new Card(suit, value)))
                .forEach(System.out::println);
    }

}
