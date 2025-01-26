public class ThreadPriorityDemo {
    
    // Task for the threads to execute
    static class MyThread extends Thread {
        private String name;

        public MyThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " - Iteration " + i + " (Priority: " + getPriority() + ")");
                try {
                    Thread.sleep(100);  // Simulate work by sleeping for a while
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Create three threads with different priorities
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        // Set the thread priorities
        thread1.setPriority(Thread.MIN_PRIORITY);     // 1
        thread2.setPriority(Thread.NORM_PRIORITY);    // 5 (default)
        thread3.setPriority(Thread.MAX_PRIORITY);     // 10

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("All threads have completed.");
    }
}
