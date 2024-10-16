class FirstThread extends Thread {
    public void run() {
        System.out.println("Thread 'FIRST' is running with priority: " + this.getPriority());
    }
}

class SecondThread extends Thread {
    public void run() {
        System.out.println("Thread 'SECOND' is running with priority: " + this.getPriority());
    }
}

class ThirdThread extends Thread {
    public void run() {
        System.out.println("Thread 'THIRD' is running with priority: " + this.getPriority());
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        // Create the thread objects
        FirstThread first = new FirstThread();
        SecondThread second = new SecondThread();
        ThirdThread third = new ThirdThread();

        // Set thread names
        first.setName("FIRST");
        second.setName("SECOND");
        third.setName("THIRD");

        // Set priorities
        first.setPriority(3); // Priority of FIRST thread set to 3
        second.setPriority(Thread.NORM_PRIORITY); // Default priority 5
        third.setPriority(7); // Priority of THIRD thread set to 7

        // Start the threads
        first.start();
        second.start();
        third.start();
    }
}