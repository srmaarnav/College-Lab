import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;

public class FetchURLContent {
    public static void main(String[] args) {
        try {
            // Define the URL to fetch
            String urlString = "https://www.example.com";  
            URL url = new URL(urlString);
            
            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET"); // Set the request method to GET
            
            // Get the input stream to read the content
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            
            // Read the content line by line
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine).append("\n");
            }
            in.close();
            
            // Print the content of the URL
            System.out.println(content.toString());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
