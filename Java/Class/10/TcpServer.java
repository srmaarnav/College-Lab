import java.io.*;
import java.net.*;

public class TcpServer {

    public static void main(String[] args) {
        int port = 12345; // Port to listen on

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                try (Socket socket = serverSocket.accept()) {
                    System.out.println("New client connected");

                    // Set up input and output streams
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                    // Read two numbers from the client
                    String line1 = in.readLine();
                    String line2 = in.readLine();

                    try {
                        int num1 = Integer.parseInt(line1);
                        int num2 = Integer.parseInt(line2);

                        // Determine the larger number
                        int larger = Math.max(num1, num2);

                        // Send the result back to the client
                        out.println("The larger number is: " + larger);
                    } catch (NumberFormatException e) {
                        out.println("Invalid input. Please send two integers.");
                    }
                } catch (IOException ex) {
                    System.out.println("Error handling client connection: " + ex.getMessage());
                }
            }

        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

