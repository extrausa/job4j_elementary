package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        assertThat(
                DummyBot.answer("привет, бот!"),
                is("Привет, умник!")
        );
    }

    @Test
    public void whenByeBot() {
        assertThat(
                DummyBot.answer("пока"),
                is("до скорой встречи")
        );
    }

    @Test
    public void whenUnknownBot() {
        assertThat(
                DummyBot.answer("Привет"),
                is("Вопрос ставит меня в тупик. Задайте другой вопрос.")
        );
    }
}