package ru.job4j.oop;
//1.7. Состояние объекта [#363136]
public class Batarey {
    private int load;

    public Batarey(int load) {
        this.load = load;
    }

    public void exchange(Batarey another) {
        another.load += this.load;
        this.load = 0;


    }

    public static void main(String[] args) {
        Batarey firstBatarey = new Batarey(100);
        Batarey secondBatarey = new Batarey(80);
        System.out.println("firstBatarey : " + firstBatarey.load + ". second : " + secondBatarey.load);
        firstBatarey.exchange(secondBatarey);
        System.out.println("firstBatarey : " + firstBatarey.load + ". second : " + secondBatarey.load);
    }

}
