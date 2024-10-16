import java.util.Random;

class RandomNumberGenerator extends Thread {
    public static int number;
    @Override
    public void run() {
        int i=1;
        Random rand = new Random();
        while (i<10) {
            number = rand.nextInt(100);
            System.out.println("Generated Number: " + number);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("RandomNumberGenerator interrupted.");
            }
            i++;
        }
    }
}

public class RandomGenerator {
    public static void main(String[] args) {
        RandomNumberGenerator r = new RandomNumberGenerator();
        r.start();
    }
}