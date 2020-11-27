package ru.job4j.search;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PriorityQueueTest {

    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();

        queue.put(new Task("2urgent", 2));
        queue.put(new Task("low", 5));
        queue.put(new Task("5low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("4urgent", 4));
        queue.put(new Task("0urgent", 0));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("0urgent"));
    }
}