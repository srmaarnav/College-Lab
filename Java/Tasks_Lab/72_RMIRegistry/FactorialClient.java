import java.rmi.*;

public class FactorialClient {
    public static void main(String[] args) {
        try {
            // Lookup the RMI registry for the remote service
            FactorialService service = (FactorialService) Naming.lookup("rmi://localhost/FactorialService");
            
            // Get the number from the user
            int number = 5; 
            
            // Call the remote method to calculate factorial
            long factorial = service.calculateFactorial(number);
            
            // Display the result
            System.out.println("Factorial of " + number + " is " + factorial);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
