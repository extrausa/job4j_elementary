package ru.job4j.pojo;
//2. Модель данных. [#363151]
public class College {
    public static void main(String[] args) {
        Student first = new Student();
        first.setName("Jey");
        first.setSurname("Strigh");
        first.setMiddleName("Pitrovich");
        first.setGroup(12);
        first.setYearStartStudy(2020);
        System.out.println(String.format("%n\"Имя\":%s; %n\"Фамилия\":%s; %n\"Очество\":%s; %n\"Год поступления\":%d;",
                first.getName(), first.getSurname(), first.getMiddleName(), first.getYearStartStudy()));

    }
}
