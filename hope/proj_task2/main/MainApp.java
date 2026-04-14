package main;

import buffer.SharedBuffer;
import producer.Producer;
import consumer.Consumer;

public class MainApp {

    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(new Producer(buffer));
        Thread consumer = new Thread(new Consumer(buffer));

        producer.start();
        consumer.start();
    }
}