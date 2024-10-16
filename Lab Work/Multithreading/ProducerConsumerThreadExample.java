class SharedBuffer {
    int item; // A shared place for the item
    boolean isProduced = false; // Whether the item is produced or not

    public synchronized void produce() throws InterruptedException {
        if (isProduced) {
            return;  // If an item is already produced, do nothing
        }
        item = (int) (Math.random() * 100); // Produce a random item
        System.out.println("Produced: " + item);
        isProduced = true; // Mark the item as produced
        notify(); // Notify the consumer that the item is ready
    }

    public synchronized void consume() throws InterruptedException {
        if (!isProduced) {
            return;  // If no item is produced, do nothing
        }
        System.out.println("Consumed: " + item); // Consume the item
        isProduced = false; // Mark that the item has been consumed
        notify(); // Notify the producer that the buffer is now empty
    }
}

class Producer extends Thread {
    SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                buffer.produce(); // Produce an item
                Thread.sleep(1000); // Simulate some delay
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                buffer.consume(); // Consume an item
                Thread.sleep(1000); // Simulate some delay
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumerThreadExample {
    public static void main(String[] args) throws InterruptedException {
        SharedBuffer buffer = new SharedBuffer(); // Shared buffer

        // Create producer and consumer threads by extending Thread
        Producer producerThread = new Producer(buffer);
        Consumer consumerThread = new Consumer(buffer);

        // Start the threads
        producerThread.start();
        consumerThread.start();

        // Wait for both threads to complete
        producerThread.join();
        consumerThread.join();

        System.out.println("Producer and Consumer have finished execution.");
        
    }
}
