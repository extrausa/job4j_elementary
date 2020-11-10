package ru.job4j.ex;
//0.3. Тестирование исключений с junit [#363100]
import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void when5then120() {
        int rsl = Fact.calc( -5);





    }


}