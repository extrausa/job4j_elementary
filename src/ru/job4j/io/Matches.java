package ru.job4j.io;
//2. Scanner и чтение числа из консоли. [#363080]
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int point = 11;
        Scanner inputPlayer = new Scanner(System.in);
        //Scanner inputPlayerTwo = new Scanner(System.in);
        System.out.println("Берем от 1 до 3 спичек");
        while (point > 0) {
            System.out.println("количество спичек = " + point);
            System.out.println("Ход первого игрока");
            int selectPlaerOne = Integer.valueOf(inputPlayer.nextLine());
            point -= selectPlaerOne;
            if (point < 0 || selectPlaerOne > 3) {
                point += selectPlaerOne;
                System.out.println("подумай ещё");
                selectPlaerOne = Integer.valueOf(inputPlayer.nextLine());
                point -= selectPlaerOne;
                if (point < 0 || selectPlaerOne > 3) {
                    point += selectPlaerOne;
                } else if (point == 0) {
                    System.out.println("победа");
                    break;
                }
            }else if (point == 0) {
                System.out.println("победа");
                break;
            }
            System.out.println("количество спичек = " + point);
            System.out.println("ход перешел второму игроку");
            System.out.println("Второй игрок, ждём твой ход");
            int selectPlaerTwo = Integer.valueOf(inputPlayer.nextLine());
            point -= selectPlaerTwo;
            if (point < 0 || selectPlaerTwo > 3) {
                point += selectPlaerTwo;
                System.out.println("подумай ещё");
                selectPlaerOne = Integer.valueOf(inputPlayer.nextLine());
                point -= selectPlaerTwo;
                if (point < 0 || selectPlaerTwo > 3) {
                    point += selectPlaerTwo;
                } else if (point == 0) {
                    System.out.println("победа");
                    break;
                }
            }else if (point == 0) {
                System.out.println("победа");
                break;
            }

        }
    }

}
