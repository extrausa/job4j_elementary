package ru.job4j.condition;
//4.1.1. Операторы сравнения в String. [#362921]
public class Game {
    public static void menu(String nameGame) {
        if (nameGame.equals("super mario")) {
            System.out.println("start game Super mario");
        }
        if (nameGame.equals("bomberman")) {
            System.out.println("start game Bomberman");
        }
        if (nameGame.equals("tetris")) {
            System.out.println("start game Tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("bomberman");
        Game.menu("tetris");
        Game.menu("super mario");
    }
}
