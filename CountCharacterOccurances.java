package Java_Basic_Programs;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CountCharacterOccurances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        Map<Character, Integer> charCount = countCharacterOccurrences(input);
        System.out.println("\nCharacter Occurrences:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
        scanner.close();
    }

    public static Map<Character, Integer> countCharacterOccurrences(String str) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                continue;
            }
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }
        return charMap;
    }
}
