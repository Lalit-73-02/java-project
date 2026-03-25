class Welcome extends Thread {

    public void run() {
        while (true) {
            System.out.print("Welcome ");

            try {
                Thread.sleep(200); // 200 milliseconds delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class thar {
    public static void main(String[] args) {

        Welcome w = new Welcome();
        w.start(); // thread start
    }
}