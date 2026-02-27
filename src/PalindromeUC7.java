import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeUC7 {
    public static void main(String[] args) {
        // UC7: Deque-Based Optimized Palindrome Checker
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check (UC7-Deque): ");
        String input = scanner.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalin = true;
        // Optimized Data Handling – remove from first & last and compare
        while (deque.size() > 1) {
            // Compare front and rear elements directly
            if (!Character.valueOf(deque.removeFirst()).equals(deque.removeLast())) {
                isPalin = false;
                break;
            }
        }

        if (isPalin) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }

        scanner.close();
    }
}
