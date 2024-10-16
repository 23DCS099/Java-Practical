class SumTask implements Runnable {
    private int start;
    private int end;
    private int[] result;
    private int index;

    public SumTask(int start, int end, int[] result, int index) {
        this.start = start;
        this.end = end;
        this.result = result;
        this.index = index;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        result[index] = sum; // Store the partial sum in the result array
    }
}

public class SumWithThreads {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two arguments: N and the number of threads.");
            return;
        }

        int N = Integer.parseInt(args[0]);
        int numThreads = Integer.parseInt(args[1]);

        // Array to hold the partial results
        int[] result = new int[numThreads];

        // Calculate the range for each thread
        int range = N / numThreads;
        int remainder = N % numThreads;

        Thread[] threads = new Thread[numThreads];

        int start = 1;
        for (int i = 0; i < numThreads; i++) {
            int end = start + range - 1;

            if (i == numThreads - 1) {
                end += remainder; // Add the remainder to the last thread's range
            }

            threads[i] = new Thread(new SumTask(start, end, result, i));
            threads[i].start();

            start = end + 1;
        }

        // Wait for all threads to finish
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        // Calculate the final sum
        int finalSum = 0;
        for (int sum : result) {
            finalSum += sum;
        }

        // Display the final result
        System.out.println("The sum of the first " + N + " numbers is: " + finalSum);
        System.out.println("Name: Krishil Agrawal\nID: 23DCS001");
    }
}