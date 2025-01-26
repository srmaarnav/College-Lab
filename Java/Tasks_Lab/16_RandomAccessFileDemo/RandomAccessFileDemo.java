import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) {
        String fileName = "randomAccessFileDemo.txt";
        
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            // Write data to the file at specific positions
            raf.writeUTF("Hello, ");
            raf.seek(20);  // Move the file pointer to position 20
            raf.writeUTF("This is a test message!");
            raf.seek(10);  // Move the file pointer to position 10
            raf.writeUTF("World! ");
            
            // Now, read the data back from the file at specific positions
            raf.seek(0);  // Move the file pointer to the beginning
            System.out.println("First read: " + raf.readUTF());
            
            raf.seek(10);  // Move the file pointer to position 10
            System.out.println("Second read: " + raf.readUTF());
            
            raf.seek(20);  // Move the file pointer to position 20
            System.out.println("Third read: " + raf.readUTF());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
