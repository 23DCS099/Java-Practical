import java.util.Random;

class RandomNumberGenerator extends Thread {
    public static int number;

    public void run() {
        Random rand = new Random();
        while (true) {
            number = rand.nextInt(100);
            System.out.println("Generated Number: " + number);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("RandomNumberGenerator interrupted.");
            }
        }
    }
}

class SquareCalculator extends Thread {
    public void run() {
        while (true) {
            if (RandomNumberGenerator.number % 2 == 0) {
                int square = RandomNumberGenerator.number * RandomNumberGenerator.number;
                System.out.println("Square of " + RandomNumberGenerator.number + " is: " + square);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("SquareCalculator interrupted.");
            }
        }
    }
}

class CubeCalculator extends Thread {
    public void run() {
        while (true) {
            if (RandomNumberGenerator.number % 2 != 0) {
                int cube = RandomNumberGenerator.number * RandomNumberGenerator.number * RandomNumberGenerator.number;
                System.out.println("Cube of " + RandomNumberGenerator.number + " is: " + cube);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("CubeCalculator interrupted.");
            }
        }
    }
}

public class MultiThreadedApplication {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        SquareCalculator squareCalculator = new SquareCalculator();
        CubeCalculator cubeCalculator = new CubeCalculator();

        randomNumberGenerator.start();
        squareCalculator.start();
        cubeCalculator.start();
        System.out.println("Name: Krishil Agrawal\nID: 23DCS001");
    }
}
