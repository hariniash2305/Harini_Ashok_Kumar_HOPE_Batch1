package buffer;

import java.util.*;

public class SharedBuffer {

    private Queue<Integer> queue = new LinkedList<>();
    private final int CAPACITY = 5;

    public synchronized void produce(int value) throws InterruptedException {

        while (queue.size() == CAPACITY) {
            wait(); // wait if full
        }

        queue.add(value);
        System.out.println("Produced: " + value);

        notify(); // wake consumer
    }

    public synchronized int consume() throws InterruptedException {

        while (queue.isEmpty()) {
            wait(); // wait if empty
        }

        int val = queue.poll();
        System.out.println("Consumed: " + val);

        notify(); // wake producer
        return val;
    }
}