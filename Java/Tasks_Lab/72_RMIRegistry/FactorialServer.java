import java.rmi.*;
import java.rmi.server.*;

public class FactorialServer extends UnicastRemoteObject implements FactorialService {
    
    public FactorialServer() throws RemoteException {
        super();
    }

    // Method to calculate factorial
    public long calculateFactorial(int number) throws RemoteException {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            // Create an instance of the server
            FactorialServer server = new FactorialServer();
            
            // Bind the server object to the RMI registry
            Naming.rebind("rmi://localhost/FactorialService", server);
            System.out.println("FactorialServer is ready.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
