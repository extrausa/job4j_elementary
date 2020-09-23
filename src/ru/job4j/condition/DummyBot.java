package ru.job4j.condition;
//4.1.2. Глупый бот [#362915]
public class DummyBot {
    public static String answer(String questions) {
        String rsl = "Вопрос ставит меня в тупик. Задайте другой вопрос.";
        if ("привет, бот!".equals(questions)) {
            rsl = "Привет, умник!";
        } else if ("пока".equals(questions)) {
            rsl = "до скорой встречи";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("привет, бот!");
        System.out.println(rsl);
        rsl = DummyBot.answer("пока");
        System.out.println(rsl);
        rsl = DummyBot.answer("Привет, бот!");
        System.out.println(rsl);

    }
}
