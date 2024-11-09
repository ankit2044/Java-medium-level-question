package November_8;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Question: Write a Java method that counts the frequency of each character in a given string and displays it. For example, given "apple," it should print a:1, p:2, l:1, e:1.
//Hint: Using a Map<Character, Integer> can help with counting occurrences.
//Check if a String is a Rotation of Another String

public class  Count_ch_Frequency {

    public static void countCharacterFrequency(String input) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);


            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }

        // Display the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        System.out.println("enter a String");
        Scanner sc=new Scanner(System.in);
        String input = sc.next();
        countCharacterFrequency(input);
    }
}
