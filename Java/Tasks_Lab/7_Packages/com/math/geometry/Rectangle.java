package com.math.geometry;

public class Rectangle {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double area() {
        return length * width;
    }

    // Method to calculate perimeter
    public double perimeter() {
        return 2 * (length + width);
    }
}
