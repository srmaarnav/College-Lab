import java.util.concurrent.CompletableFuture;

/**
 * CompleteableFutureExample
 */
public class CompleteableFutureExample {

    CompletableFuture<String> future;

    public CompleteableFutureExample() {
        future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello, world!";
        });

        future.thenAccept(result -> System.out.println("This is result\n"+result)).join();
    }

    public static void main(String[] args) {
        new CompleteableFutureExample();
    }
}