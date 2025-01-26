// Write a program to read input string from the user and write the vowels of that string in vowels.txt and consonants in consonants.txt.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputAndFileHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        for(char c : input.toCharArray())
        {
            if(!isChar(c)){
                continue;
            }
            else
            {
                if(isVowel(c)){
                    vowels.append(c);
                }else {
                    consonants.append(c);
                }
    
            }
        }

        try {
            FileWriter vowelsWriter = new FileWriter("./vowels.txt");
            vowelsWriter.write(vowels.toString());
            vowelsWriter.close();

            FileWriter consonantWriter = new FileWriter("./consonants.txt");
            consonantWriter.write(consonants.toString());
            consonantWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    private static boolean isChar(char c){
        return Character.isLetter(c);
    }
}