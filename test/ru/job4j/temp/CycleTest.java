package ru.job4j.temp;

import org.junit.Test;

import static org.junit.Assert.*;

public class CycleTest {

    @Test
    public void test() {
        assertEquals(0, Cycle.mult(0, 2));
        assertEquals(2, Cycle.mult(1, 2));
        assertEquals(6, Cycle.mult(1, 3));
    }

    @Test
    public void mod() {
        assertEquals(0, Cycle.mod(4, 2));
        assertEquals(1, Cycle.mod(3, 2));
        assertEquals(2, Cycle.mod(8, 3));
        assertEquals(0, Cycle.mod(0, 3));
    }
}