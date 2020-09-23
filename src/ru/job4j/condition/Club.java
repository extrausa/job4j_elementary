package ru.job4j.condition;
//4.3.2. Оператор || [#362926]
public class Club {

    public static void permision(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else  {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {

        boolean hasMoney = true;
        boolean beFriend = false;
        Club.permision(hasMoney, beFriend);

    }
}
