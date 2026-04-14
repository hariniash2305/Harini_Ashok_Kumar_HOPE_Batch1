package producer;

import buffer.SharedBuffer;

public class Producer implements Runnable {

    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        int i = 1;

        while (true) {
            try {
                buffer.produce(i++);
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}