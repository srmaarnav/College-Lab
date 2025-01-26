public class SharedCounter {
    private int counter = 0;

    // Synchronized method to safely increment the counter
    public synchronized void increment() {
        counter++;
    }

    // Method to get the current value of the counter
    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        SharedCounter sharedCounter = new SharedCounter();

        // Create 10 threads that will update the counter
        Thread[] threads = new Thread[10];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    // Increment the counter 1000 times
                    for (int j = 0; j < 1000; j++) {
                        sharedCounter.increment();
                    }
                }
            });
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread t : threads) {
            t.join();
        }

        // Display the final counter value
        System.out.println("Final counter value: " + sharedCounter.getCounter());
    }
}
