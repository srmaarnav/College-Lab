import com.math.geometry.Rectangle;
import com.math.algebra.EquationSolver;

public class Main {
    public static void main(String[] args) {
        // Create Rectangle object
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Calculate area and perimeter
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        // Solve a quadratic equation
        EquationSolver.solveQuadratic(1, -3, 2);
    }
}
