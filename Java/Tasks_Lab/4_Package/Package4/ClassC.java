package Package4;

public class ClassC {

    public static void main(String[] args) {
        // Create objects
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();

        // Accessing public field
        System.out.println(classA.publicData);

        // Accessing private field via method
        classA.showPrivateData();

        // Accessing protected field via subclass
        classB.showProtectedData();
    }
}
