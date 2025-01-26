import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializeExample {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 101, 50000.0);

        try (FileOutputStream fileOut = new FileOutputStream("employee.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(emp);
            System.out.println("Employee object has been serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

