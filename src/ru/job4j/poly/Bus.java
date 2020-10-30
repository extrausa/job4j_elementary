package ru.job4j.poly;
//3. Интерфейс Input [#363081]
public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Drive in Mexico");
    }

    @Override
    public void countPassengers(int numb) {
        System.out.println("Quantity passengers " + numb);

    }

    @Override
    public double gasStation(double litr) {

        return litr * 2.5;
    }
}
