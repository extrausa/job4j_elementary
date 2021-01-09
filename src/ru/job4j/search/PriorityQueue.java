package ru.job4j.search;
//2. Очередь с приоритетом на LinkedList [#363059]
import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();
    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */

    public void put(Task task) {
        var index = 0;
        for (var element : tasks) {
            if (element.getPriority() > task.getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }

    public static void main(String[] args) {


        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task( "Petr" , 3));
        queue.put(new Task( "Ivan" , 1));
        queue.put(new Task("Stepan", 3));
        Task result = queue.take();



    }
}
