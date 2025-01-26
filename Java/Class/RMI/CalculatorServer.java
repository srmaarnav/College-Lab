import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            // Start the RMI registry on port 1099
            LocateRegistry.createRegistry(9099);

            // Create and bind the Calculator implementation to the registry
            CalculatorImpl calculator = new CalculatorImpl();
            Naming.rebind("CalculatorService", calculator);

            System.out.println("Calculator Server is ready.");
        } catch (Exception e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

