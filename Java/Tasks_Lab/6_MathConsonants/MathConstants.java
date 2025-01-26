public class MathConstants {
    // Final variable to store the value of PI
    public static final double PI = 3.14159;

    // Static method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        // Test the static method by passing a radius
        double radius = 5.0;
        double area = MathConstants.calculateArea(radius);
        
        // Display the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
