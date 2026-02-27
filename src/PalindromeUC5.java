import java.util.Scanner;
import java.util.Stack;

public class PalindromeUC5 {
    public static void main(String[] args) {
        // UC5: Stack-Based Palindrome Checker
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check (UC5-Stack): ");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push Operation – Used to insert characters into the stack (LIFO)
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Reversal Logic – Stack naturally reverses the order
        String reversed = "";
        while (!stack.isEmpty()) {
            // Pop Operation – Used to remove characters in reverse order
            reversed += stack.pop();
        }

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }

        scanner.close();
    }
}
