import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        // Specify the source and destination file paths
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        // Byte array for file copying
        byte[] buffer = new byte[1024];  // Buffer to hold data temporarily
        int bytesRead;

        try (FileInputStream inputStream = new FileInputStream(sourceFile);
             FileOutputStream outputStream = new FileOutputStream(destinationFile)) {

            // Read and write file data in chunks
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);  // Write bytes to destination
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
