package November_8;
import java.util.HashSet;
import java.util.Set;


// Question: Write a Java method to remove duplicate characters from a string while maintaining the order of characters. For example, given "programming", the result should be "progamin".
//Hint: Use a Set to track duplicates or check character positions.

public class Remove_Duplicate{
    public static String removeDuplicateCharacters(String input) {
        Set<Character> ch = new HashSet<>();
        StringBuilder result = new StringBuilder(); // result store

        for (char c : input.toCharArray()) {
            if (!ch.contains(c)) {
                result.append(c);
                ch.add(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicateCharacters(input);
        System.out.println(result); // Output: progamin
    }
}
