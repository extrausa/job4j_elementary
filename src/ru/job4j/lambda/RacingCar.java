package ru.job4j.lambda;
//9. Шаблоны проектирования в Stream API [#362901]
public class RacingCar {
    private String modelCar;
    private Integer year;
    private String color;
    private String transmition;
    private Integer speedLimit;


    public static class Builder {
        private RacingCar newCar;

        public Builder() {
            newCar = new RacingCar();
        }

        public Builder withNameModel(String name){
            newCar.modelCar = name;
            return this;
        }

        public Builder withYearModel(Integer year){
            newCar.year = year;
            return this;
        }

        public Builder withColorModel(String color){
            newCar.modelCar = color;
            return this;
        }

        public Builder withTransmitionModel(String transmition){
            newCar.modelCar = transmition;
            return this;
        }

        public Builder withSpeedLimitModel(Integer speedLimit){
            newCar.speedLimit = speedLimit;
            return this;
        }

        public RacingCar build() {
            return newCar;
        }
    }

    public static void main(String[] args) {
        RacingCar car = new RacingCar.Builder()
                .withColorModel("Green")
                .withSpeedLimitModel(220)
                .withTransmitionModel("AT")
                .withNameModel("Toyota")
                .withYearModel(2021)
                .build();

    }




}
