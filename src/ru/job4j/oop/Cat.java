package ru.job4j.oop;
//1.5. Поля объекта [#363131]
public class Cat {
    public String food;
    public String name;

    public void show() {
        System.out.println(this.food);
        System.out.println(this.name);
    }

    public void giveNiK(String nik) {
        this.name = nik;
    }

    public void eat(String meat){
        this.food = meat;
    }
    public static void main(String[] args) {
        Cat peppy = new Cat();
        peppy.giveNiK("Гав");
        peppy.eat("Сосиска");
        peppy.show();

        Cat blackCat = new Cat();
        peppy.giveNiK("Сажа");
        peppy.eat("Котлета");
        peppy.show();
        //Cat sparky = new Cat();
    }
}
