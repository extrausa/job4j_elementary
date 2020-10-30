package ru.job4j.io;
//1. Чтение из консоли. Класс Scanner. [#363079]
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        int answer = new Random().nextInt(3);
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий оракул. Что ты хочешь узнать? ");
        String word = input.nextLine();
        System.out.println(answer);
        String answerQuestion = (answer > 0 && answer < 2) ? "No" : "Yes";
        if (answer == 0 ) {
            answerQuestion = "Yes";
        } else if (answer == 1) {
            answerQuestion = "No";
        } else {
            answerQuestion = "May be";
        }
        System.out.println(answerQuestion);



    }
}
