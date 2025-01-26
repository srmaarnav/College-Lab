class MultiThreadingDemo extends Thread{
    public void run()
    {
        try {
            //Display thread is running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception is caught");
        }
    }
}

public class Multithread {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            MultiThreadingDemo object = new MultiThreadingDemo();
            object.start();
        }
    }
    
}