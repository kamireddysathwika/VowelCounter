import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to count vowels and print the result
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels in the given string: " + vowelCount);

        // Close the scanner
        scanner.close();
    }
    public static int countVowels(String str) {
        // Convert the string to lowercase for easy comparison
        str = str.toLowerCase();

        // Initialize vowel count
        int count = 0;

        // Iterate through the string and check for vowels
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        // Return the total count
        return count;
    }
}

