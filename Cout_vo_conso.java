package November_8;

//Question: Write a Java method to count the number of vowels and consonants in a given string.
//Hint: Use a loop to iterate through the string and a conditional check for vowel characters.

import java.util.Scanner;

public class Cout_vo_conso {

    public static void countVowelsAndConsonants(String input) {

        int vowelCount = 0;
        int consonantCount = 0;

        input = input.toLowerCase();


        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);


            if (Character.isLetter(c)) {

                if ("aeiou".indexOf(c) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Print the results
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input =sc.next();
        countVowelsAndConsonants(input);
    }
}
