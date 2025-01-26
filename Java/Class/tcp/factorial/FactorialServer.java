import java.io.*;
import java.net.*;

public class FactorialServer {
    public static void main(String[] args) {
        try {
            // Server listens on port 1234
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server is waiting for a client connection...");

            // Accept client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            // Create input and output streams
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            // Read number from client
            int number = inputStream.readInt();
            System.out.println("Received number: " + number);

            // Calculate factorial
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Send factorial back to client
            outputStream.writeLong(factorial);
            System.out.println("Sent factorial: " + factorial);

            // Close connections
            inputStream.close();
            outputStream.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

