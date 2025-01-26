import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializeExample {
    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("employee.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Employee emp = (Employee) in.readObject();
            System.out.println("Employee object has been deserialized.");
            System.out.println(emp); // Notice salary will be 0.0 due to transient
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

