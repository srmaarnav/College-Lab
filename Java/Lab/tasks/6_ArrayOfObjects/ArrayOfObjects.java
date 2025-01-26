import java.util.Scanner;

class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the number of persons: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Define an array of Person objects
        Person[] persons = new Person[size];

        // Taking Person object input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            persons[i] = new Person(name, age);
        }

        // Iterate through the array using forEach loop
        System.out.println("Details of persons:");
        for (Person person : persons) {
            // Print specific properties of each Person object
            System.out.println("Name: " + person.name + ", Age: " + person.age);
        }

        scanner.close();
    }
}
