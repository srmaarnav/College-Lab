package com.math.algebra;

public class EquationSolver {

    public static void solveQuadratic(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Root is real and the same: " + root);
        } else {
            System.out.println("Roots are complex.");
        }
    }
}
