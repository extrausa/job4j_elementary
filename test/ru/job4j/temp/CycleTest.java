package ru.job4j.temp;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CycleTest {


    @Test
    public void sum() {
        assertEquals(3, Cycle.sum(12));
    }

    @Test
    public void test() {
        assertEquals(1, Cycle.count(1, 2));
        assertEquals(2, Cycle.count(1, 3));
        assertEquals(2, Cycle.count(1, 4));
        assertEquals(3, Cycle.count(1, 5));
    }

    @Test
    public void countSection() {
        assertEquals(1, Cycle.countSection(1, 1));
        assertEquals(2, Cycle.countSection(2, 1));
        assertEquals(1, Cycle.countSection(3, 2));
        assertEquals(2, Cycle.countSection(4, 2));
    }

    @Test
    public void secondSumm() {
        assertEquals(1, Cycle.sum(1, 2));
        assertEquals(4, Cycle.sum(1, 3));
        assertEquals(4, Cycle.sum(1, 4));
        assertEquals(9, Cycle.sum(1, 5));
        assertEquals(12, Cycle.sum(0, 6));
    }

    @Test
    public void checkStringsIs3() {
        int rsl = Cycle.checkStrings("2173896", "2233796");
        assertThat(rsl, is(3));
    }

    @Test
    public void checkStringsIs5() {
        int rsl = Cycle.checkStrings("abcde", "bcdef");
        assertThat(rsl, is(5));
    }

    @Test
    public void checkStringsIs0() {
        int rsl = Cycle.checkStrings("abcde", "abcde");
        assertThat(rsl, is(0));
    }

    @Test
    public void codeLengthGreat4() {
        String code = Cycle.code("4556364607935616");
        assertThat(code, is("############5616"));
    }

    @Test
    public void codeLengthLess4() {
        String code = Cycle.code("123");
        assertThat(code, is("123"));
    }

    @Test
    public void codeEmptyString() {
        String code = Cycle.code("");
        assertThat(code, is("empty"));
    }

    @Test
    public void checkTrue() {
        boolean check = Cycle.check(1112111);
        assertThat(check, is(true));
    }

    @Test
    public void checkFalse() {
        boolean check = Cycle.check(123456321);
        assertThat(check, is(false));
    }

    @Test
    public void collect() {
        String s = "North Atlantic Treaty Organization";
        String rsl = Cycle.collect(s);
        assertThat(rsl, is("NATO"));
    }

    @Test
    public void collect1() {
        String s = "Chief Executive Officer";
        String rsl = Cycle.collect(s);
        assertThat(rsl, is("CEO"));
    }

    @Test
    public void collect2() {
        String s = "United Nations Organization";
        String rsl = Cycle.collect(s);
        assertThat(rsl, is("UNO"));
    }

    @Test
    public void whenSorted() {
        assertThat(
                Cycle.isSorted(
                        new int[] {1, 2, 3}
                ),
                is(true)
        );
    }

    @Test
    public void whenNotSorted() {
        assertThat(
                Cycle.isSorted(
                        new int[] {1, 3, 2}
                ),
                is(false)
        );
    }

    @Test
    public void whenHasCross() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Cycle.printCrossEl(
                new int[] {1, 3},
                new int[] {2, 1}
        );
        assertThat(out.toString(), is("1" + System.lineSeparator()));
    }

    @Test
    public void whenNotCross() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Cycle.printCrossEl(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(out.toString(), is(""));
    }

}