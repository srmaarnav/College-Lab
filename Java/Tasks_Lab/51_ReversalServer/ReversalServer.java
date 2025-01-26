import java.net.*;
import java.io.*;

public class ReversalServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server is listening on port 12345");

            // Accept client connection
            try (Socket socket = serverSocket.accept()) {
                System.out.println("Client connected: " + socket.getInetAddress());

                // Create input and output streams
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

                // Read the message from the client
                String message = input.readLine();
                System.out.println("Received from client: " + message);

                // Reverse the message
                String reversedMessage = new StringBuilder(message).reverse().toString();

                // Send the reversed message back to the client
                output.println(reversedMessage);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
