import java.net.*;

public class UDPSquareServer {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            // Create a DatagramSocket to receive and send UDP packets
            socket = new DatagramSocket(9876);
            System.out.println("Server is listening on port 9876...");

            while (true) {
                byte[] receiveData = new byte[1024];
                
                // Receive data from the client
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);
                
                // Convert received data to string and extract the number
                String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                int number = Integer.parseInt(receivedMessage.trim());
                System.out.println("Received number: " + number);

                // Calculate the square of the number
                int square = number * number;

                // Send the result back to the client
                String response = String.valueOf(square);
                byte[] sendData = response.getBytes();
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                // Send the squared value as a response
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                socket.send(sendPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }
}
