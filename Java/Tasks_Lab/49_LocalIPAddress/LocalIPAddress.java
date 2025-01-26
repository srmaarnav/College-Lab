import java.net.*;

public class LocalIPAddress {
    public static void main(String[] args) {
        try {
            // Get the local host IP address
            InetAddress localHost = InetAddress.getLocalHost();
            String ipAddress = localHost.getHostAddress();

            int port = 8080;

            // Display the IP address and port number
            System.out.println("Local IP Address: " + ipAddress);
            System.out.println("Port Number: " + port);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
