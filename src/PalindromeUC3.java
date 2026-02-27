import java.util.Scanner;

public class PalindromeUC3 {
    public static void main(String[] args) {
        // UC3: Palindrome Check Using String Reverse
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check (UC3): ");
        String original = scanner.nextLine();

        String reversed = "";

        // Loop (for loop) – Used to iterate through the characters in reverse order
        for (int i = original.length() - 1; i >= 0; i--) {
            // String Concatenation (+) – building the reversed string character by
            // character
            reversed = reversed + original.charAt(i);
        }

        // equals() Method – Used to compare the actual content
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Result: '" + original + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + original + "' is NOT a palindrome.");
        }

        scanner.close();
    }
}
