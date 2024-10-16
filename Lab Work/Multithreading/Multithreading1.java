// Extending the Thread class

class Multithreading1 extends Thread {

    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        // Create a new thread
        Multithreading1 thread = new Multithreading1();
        // Start the thread
        thread.start();
        System.out.println("Name: Krishil Agrawal\nID: 23DCS001");
    }
}
