import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Enter a number: ");
        number = sc.nextInt();
        
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + result);

        sc.close();
    }
}
