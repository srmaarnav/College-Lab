/**
 * RandomAccessFileDemo
 */
import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomAccessFileDemo {

    public static void main(String[] args) {
        try {
            // Create a RandomAccessFile instance
            RandomAccessFile file = new RandomAccessFile("example.txt", "rw");

            // Write data to file
            file.writeUTF("Hello, world!");
            file.writeInt(12324);
            file.writeDouble(3.12321);

            // Moving file pointer to beginning
            file.seek(0);

            // Read and print the data
            String str = file.readUTF();
            int num = file.readInt();
            double pi = file.readDouble();

            System.out.println("String: " + str);
            System.out.println("Integer: " + num);
            System.out.println("Double: " + pi);

            // Move the file pointer to the position of the integer
            file.seek(14); // "Hello, world!" is 13 bytes + 1 byte for UTF length

            // Read and print the integer
            num = file.readInt();
            System.out.println("Integer at position 14: " + num);

            // Close the file            file.writeUTF("Hello, world!");
            file.writeInt(12324);
            file.writeDouble(3.12321);

            file.close();

        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }    
}