import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0, denominator = 0;

        // Prompt the user for input
        try {
            System.out.print("Enter the numerator: ");
            numerator = Integer.parseInt(scanner.nextLine());  // Handle non-numeric input
            
            System.out.print("Enter the denominator: ");
            denominator = Integer.parseInt(scanner.nextLine());  // Handle non-numeric input

            // Perform division and handle division by zero
            if (denominator == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input! Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
