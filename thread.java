// ✅ Method 1: Extending Thread class

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // thread created
        t1.start(); // thread started
    }
}

// ✅ Method 2: Implementing Runnable interface (Better 👍)

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable...");
    }

    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}