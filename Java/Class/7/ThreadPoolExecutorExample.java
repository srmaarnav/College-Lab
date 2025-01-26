import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Executing : " + name + ", Thread : " + Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed : " + name + ", Thread : " + Thread.currentThread().getName());
    }
}

public class ThreadPoolExecutorExample {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 8; i++) {
            Task task = new Task("Task " + i);
            System.out.println("Submitting : " + task.getName());
            executor.submit(task);
        }

        executor.shutdown();
    }
}