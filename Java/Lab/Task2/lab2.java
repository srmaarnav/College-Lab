// Write a program that prints name and age taking the command line arguments.

public class lab2 {
    public static void main(String[] args) {
        if (args.length < 2){
            System.out.println("Please enter your name and age: ");
        } else{
            String name = args[0];
            String age = args[1];
            System.out.println("Hi " + name + "! You are "+ age + " years old");
        }
    }
}
