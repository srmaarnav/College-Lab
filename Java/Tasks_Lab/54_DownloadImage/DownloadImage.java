import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;

public class DownloadImage {
    public static void main(String[] args) {
        // URL of the image to download
        String imageUrl = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_light_color_272x92dp.png";  
        // Local file path where the image will be saved
        String savePath = "downloaded_image.png";  
        
        try {
            // Create a URL object
            URL url = new URL(imageUrl);
            
            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            
            // Open an input stream to read the image data
            InputStream inputStream = connection.getInputStream();
            
            // Create an output stream to save the image to a file
            FileOutputStream outputStream = new FileOutputStream(savePath);
            
            // Read and write the image data in chunks
            byte[] buffer = new byte[4096]; // 4KB buffer
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            
            // Close the input and output streams
            inputStream.close();
            outputStream.close();
            
            System.out.println("Image downloaded successfully and saved as " + savePath);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
