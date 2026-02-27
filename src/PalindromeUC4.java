import java.util.Scanner;

public class PalindromeUC4 {
    public static void main(String[] args) {
        // UC4: Character Array Based Palindrome Check
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check (UC4): ");
        String input = scanner.nextLine();

        // Convert string to char[] – Primitive array for index-based access
        char[] charArray = input.toCharArray();

        boolean isPalin = checkPalindrome(charArray);

        if (isPalin) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }

        scanner.close();
    }

    /**
     * Two-Pointer Technique – One pointer starts from beginning, other from end.
     * Reduces unnecessary comparisons and demonstrates time complexity awareness.
     */
    public static boolean checkPalindrome(char[] chars) {
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Compare start & end characters (ignoring case for consistency)
            if (Character.toLowerCase(chars[left]) != Character.toLowerCase(chars[right])) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
