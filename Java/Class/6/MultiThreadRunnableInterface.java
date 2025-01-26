public class MultiThreadRunnableInterface {
    public static void main(String[] args) {
        System.out.println("Main thread is- " + Thread.currentThread().getName());
        for(int i=0; i<10; i++)
        {            
            Thread t1 = new Thread(new MultiThreadRunnableInterface().new RunnableImplementation());
            t1.start();
        }
    }
    private class RunnableImplementation implements  Runnable{
        public void run()
        {
            System.out.println(Thread.currentThread().getName() + ", executing run() method!");
        }
    }
    
}
