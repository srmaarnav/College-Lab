import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter the second number:");
        int b = scanner.nextInt();
        if (a != b) {
            if (a < b) {
                System.out.println(a + " is less than " + b);
            } else if (a > b) {
                System.out.println(a + " is greater than " + b);
            }
        } else {
            System.out.println(a + " is equivalent to " + b);
        }
        scanner.close();
    }
}
