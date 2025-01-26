import java.rmi.Naming;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            // Lookup the CalculatorService in the RMI registry
            Calculator calculator = (Calculator) Naming.lookup("rmi://localhost/CalculatorService");

            // Call the add method remotely
            int result = calculator.add(5, 3);
            System.out.println("Result of addition: " + result);
        } catch (Exception e) {
            System.out.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

