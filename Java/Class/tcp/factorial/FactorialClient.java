import java.io.*;
import java.net.*;

public class FactorialClient {
    public static void main(String[] args) {
        try {
            // Connect to the server on localhost and port 1234
            Socket socket = new Socket("localhost", 1234);

            // Create input and output streams
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            // Send number to the server
            int number = 5; // Example number
            outputStream.writeInt(number);
            System.out.println("Sent number: " + number);

            // Receive factorial from the server
            long factorial = inputStream.readLong();
            System.out.println("Received factorial: " + factorial);

            // Close connections
            inputStream.close();
            outputStream.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

