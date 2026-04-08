import java.util.concurrent.*;

/**
 * Advanced Java: Multithreading & Concurrency Demo
 */

class Counter {
    private int count = 0;

    // 'synchronized' ensures only one thread can increment at a time
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class Worker implements Runnable {
    private Counter counter;

    public Worker(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter sharedCounter = new Counter();

        // 1. Manual Thread Creation
        Thread t1 = new Thread(new Worker(sharedCounter), "Thread-1");
        Thread t2 = new Thread(new Worker(sharedCounter), "Thread-2");

        System.out.println("Starting threads manually...");
        t1.start();
        t2.start();

        // Wait for threads to finish
        t1.join();
        t2.join();

        System.out.println("Final manual count: " + sharedCounter.getCount());

        // 2. Using ExecutorService (Recommended way)
        System.out.println("\nUsing ExecutorService for thread management...");
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        Counter executorCounter = new Counter();
        for (int i = 0; i < 5; i++) {
            executor.execute(new Worker(executorCounter));
        }

        executor.shutdown();
        // Wait for all tasks to complete
        executor.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("Final executor count: " + executorCounter.getCount());
    }
}
