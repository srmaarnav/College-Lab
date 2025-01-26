//Write a program that takes name and age from user print them to console

import java.util.Scanner;

public class lab1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Hi " + name + "! You are "+ age + " years old");
        scanner.close();
    }
}