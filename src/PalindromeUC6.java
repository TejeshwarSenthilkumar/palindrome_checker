import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeUC6 {
    public static void main(String[] args) {
        // UC6: Queue + Stack Based Palindrome Check
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check (UC6-Queue+Stack): ");
        String input = scanner.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Populate both structures
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Enqueue – FIFO principle
            queue.add(ch);
            // Push – LIFO principle
            stack.push(ch);
        }

        boolean isPalin = true;
        // Logical Comparison – Matching dequeue (queue) with pop (stack)
        while (!queue.isEmpty()) {
            // Dequeue removes from front, Pop removes from end
            if (!queue.remove().equals(stack.pop())) {
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
