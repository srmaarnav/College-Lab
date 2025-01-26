public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add four integers
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Demonstrating method overloading
        System.out.println("Sum of 2 numbers (5 + 10): " + calculator.add(5, 10));
        System.out.println("Sum of 3 numbers (5 + 10 + 15): " + calculator.add(5, 10, 15));
        System.out.println("Sum of 4 numbers (5 + 10 + 15 + 20): " + calculator.add(5, 10, 15, 20));
    }
}
