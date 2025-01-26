import java.net.*;
import java.util.Scanner;

public class UDPSquareClient {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Create a DatagramSocket to send and receive UDP packets
            socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9876;

            // Read the number from the user
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            String message = String.valueOf(number);

            // Send the number to the server
            byte[] sendData = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
            socket.send(sendPacket);

            // Receive the response from the server (squared number)
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);
            
            // Convert received data to string and print the squared number
            String squaredNumber = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Squared number from server: " + squaredNumber);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
            scanner.close();
        }
    }
}
