import java.net.*;
import java.io.*;

public class ReversalClient {
    public static void main(String[] args) {
        String serverAddress = "localhost"; // Server address
        int port = 12345; // Port number
        try (Socket socket = new Socket(serverAddress, port)) {
            // Create input and output streams
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter serverOutput = new PrintWriter(socket.getOutputStream(), true);

            // Read a message from the console
            System.out.print("Enter a message: ");
            String message = consoleInput.readLine();

            // Send the message to the server
            serverOutput.println(message);

            // Receive the reversed message from the server
            String reversedMessage = serverInput.readLine();
            System.out.println("Reversed message from server: " + reversedMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
