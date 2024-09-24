import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P8_1 {
    
}
class PrimeFinderThread extends Thread {
    private int start, end;

    public PrimeFinderThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        findPrimes(start, end);
    }

    private void findPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number.");
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

class PrimeFinderRunnable implements Runnable {
    private int start, end;

    public PrimeFinderRunnable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        findPrimes(start, end);
    }

    private void findPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number.");
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

public class P8_1 {
    public static void main(String[] args) {
        int start = 1, end = 100;

        // Using Thread class
        PrimeFinderThread thread1 = new PrimeFinderThread(start, end / 2);
        PrimeFinderThread thread2 = new PrimeFinderThread(end / 2 + 1, end);
        thread1.start();
        thread2.start();

        // Using Runnable interface
        Thread runnableThread1 = new Thread(new PrimeFinderRunnable(start, end / 2));
        Thread runnableThread2 = new Thread(new PrimeFinderRunnable(end / 2 + 1, end));
        runnableThread1.start();
        runnableThread2.start();

        // Using Executor Framework
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new PrimeFinderRunnable(start, end / 2));
        executor.execute(new PrimeFinderRunnable(end / 2 + 1, end));
        executor.shutdown();
    }
}