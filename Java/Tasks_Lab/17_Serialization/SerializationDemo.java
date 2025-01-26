import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        // Serialize the Book object
        Book book1 = new Book("Java Programming", "John Doe", 39.99);
        
        // Serialization process: Write the object to a file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("book.ser"))) {
            out.writeObject(book1);
            System.out.println("Book object serialized successfully!");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

        // Deserialize the Book object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("book.ser"))) {
            Book deserializedBook = (Book) in.readObject();
            System.out.println("Book object deserialized successfully!");
            deserializedBook.displayBookInfo();  // Display the details of the deserialized book
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
