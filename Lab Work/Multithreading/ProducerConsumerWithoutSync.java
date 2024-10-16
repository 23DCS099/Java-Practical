class SharedBuffer extends Thread{
    int item;
    boolean isProduced = false;

    public synchronized void produce() throws InterruptedException {
        if (isProduced) {
            return;  // Producer cannot produce if there's an item in the buffer.
        }
        item = (int) (Math.random() * 100);
        System.out.println("Produced: " + item);
        isProduced = true;
        notify();  // Notify consumer that item is available.
    }

    public synchronized void consume() throws InterruptedException {
        if (!isProduced) {
            return;  // Consumer cannot consume if there's no item in the buffer.
        }
        System.out.println("Consumed: " + item);
        isProduced = false;
        notify();  // Notify producer that the buffer is empty.
    }
}

public class ProducerConsumerWithoutSync {
    public static void main(String[] args) throws InterruptedException {
        SharedBuffer buffer = new SharedBuffer();

        // Producer thread
        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    buffer.produce();
                    Thread.sleep(1000);  // Simulate time delay for producing.
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer thread
        Thread consumerThread = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    buffer.consume();
                    Thread.sleep(1000);  // Simulate time delay for consuming.
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start producer and consumer threads
        producerThread.start();
        consumerThread.start();

        // Use join() to make sure the main thread waits for the producer and consumer to finish
        producerThread.join();
        consumerThread.join();

        System.out.println("Producer and Consumer have finished execution.");
        
    }
}
