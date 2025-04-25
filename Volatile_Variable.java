public class Volatile_Variable {

    // Shared volatile variable
    private volatile boolean running = true;

    public void start() {
        // Thread 1: keeps running until told to stop
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 started ...");
            while (running) {
                System.out.println("running...");
            }
            System.out.println("Thread 1 stopped ...");
        });

        // Thread 2: stops thread 1 after a short delay
        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 started ...");

            try {
                Thread.sleep(1); // wait 5 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            running = false; // stop thread 1
            System.out.println("Thread 2 updated 'running' to false.");
        });

        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        new Volatile_Variable().start();
    }
}
