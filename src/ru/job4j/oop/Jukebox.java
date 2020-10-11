package ru.job4j.oop;
//1.3. Вызов метода с аргументами. [#363133]
public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут не уклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Композиция не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        int happySong = 1;
        int nightSong = 2;
        int rundom = 5;
        song.music(happySong);
        song.music(nightSong);
        song.music(rundom);
    }
}
