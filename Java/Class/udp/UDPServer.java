import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket serverSocket = new DatagramSocket(9876);
            byte[] receiveData = new byte[1024];

            System.out.println("Server is running and waiting for a message...");

            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);

                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received: " + message);

                if (message.equalsIgnoreCase("exit")) {
                    System.out.println("Server shutting down...");
                    break;
                }
            }

            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

