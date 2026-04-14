package consumer;

import buffer.SharedBuffer;

public class Consumer implements Runnable {

    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {

        while (true) {
            try {
                buffer.consume();
                Thread.sleep(800);
            } catch (Exception e) {}
        }
    }
}