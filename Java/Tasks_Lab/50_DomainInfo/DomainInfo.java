import java.net.*;

public class DomainInfo {
    public static void main(String[] args) {
        // The domain name for which we need to find the hostname and IP address
        String domainName = "www.example.com"; // Replace with any domain name
        
        try {
            // Get the InetAddress for the given domain
            InetAddress inetAddress = InetAddress.getByName(domainName);
            
            // Get the hostname and IP address
            String hostname = inetAddress.getHostName();
            String ipAddress = inetAddress.getHostAddress();
            
            // Display the results
            System.out.println("Domain Name: " + domainName);
            System.out.println("Hostname: " + hostname);
            System.out.println("IP Address: " + ipAddress);
        } catch (UnknownHostException e) {
            System.out.println("Unable to resolve domain name: " + domainName);
            e.printStackTrace();
        }
    }
}
