public class OddEvenThread {
    private static final Object lock = new Object();

    // Thread to print odd numbers
    static class OddNumberThread extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i += 2) {
                synchronized (lock) {
                    System.out.println(i);
                    lock.notify(); // Notify the other thread
                    try {
                        if (i < 9) {
                            lock.wait(); // Wait for the other thread to print even numbers
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    // Thread to print even numbers
    static class EvenNumberThread extends Thread {
        public void run() {
            for (int i = 2; i <= 10; i += 2) {
                synchronized (lock) {
                    System.out.println(i);
                    lock.notify(); // Notify the other thread
                    try {
                        if (i < 10) {
                            lock.wait(); // Wait for the other thread to print odd numbers
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create two threads: one for odd numbers and one for even numbers
        OddNumberThread oddThread = new OddNumberThread();
        EvenNumberThread evenThread = new EvenNumberThread();

        // Start both threads
        oddThread.start();
        evenThread.start();
    }
}
