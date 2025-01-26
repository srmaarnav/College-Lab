import java.io.*;
import java.net.*;

public class TcpClient {

    public static void main(String[] args) {
        String serverAddress = "localhost"; // Server's IP address
        int port = 12345; // Port to connect to

        try (Socket socket = new Socket(serverAddress, port)) {
            System.out.println("Connected to the server");

            // Set up input and output streams
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Read two numbers from the user
            System.out.print("Enter the first number: ");
            String num1 = consoleInput.readLine();
            System.out.print("Enter the second number: ");
            String num2 = consoleInput.readLine();

            // Send the numbers to the server
            out.println(num1);
            out.println(num2);

            // Read and display the server's response
            String response = in.readLine();
            System.out.println("Server says: " + response);

        } catch (IOException e) {
            System.out.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

