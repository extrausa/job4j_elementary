package ru.job4j.oop;
//1.2. Вызов метода объекта [#363132]
public class Student {

    public void music() {
        System.out.println("Tra ta tam Poom");
    }

    public void song() {
        System.out.println("I belive I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        for (int i = 0; i < 3; i++) {
            petya.music();
            petya.song();
        }
    }
}
