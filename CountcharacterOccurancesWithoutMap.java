package Java_Basic_Programs;
import java.util.Scanner;
//Question : Count the character Occurances without using built in map function
public class CountcharacterOccurancesWithoutMap {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        // Array to store character counts (assuming ASCII)
        int[] freq = new int[256];
        // Count each character
        for (char ch : input.toCharArray()) {
            if (ch != ' ') { // Skip space if needed
                freq[ch]++;
            }
        }
        System.out.println("\nCharacter Occurrences:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("'" + (char) i + "' : " + freq[i]);
            }
        }
        scanner.close();
    }
}