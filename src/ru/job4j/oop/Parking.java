package ru.job4j.oop;
//3.2. За нужно приведение типов [#363089]
public class Parking  {
    public static void main(String[] args) {
        Vechicle aircraft = new Aircraft();
        Vechicle bus = new Bus();
        Vechicle train = new Train();
        Vechicle[] arrayVechicle = new Vechicle[]{aircraft, bus, train};
        for (Vechicle v : arrayVechicle) {
            v.move();
        }
    }

}
