public class PalindromeUC2 {
    public static void main(String[] args) {
        // UC2: Print a Hardcoded Palindrome Result
        String input = "madam";

        // Logical comparison using if-else
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    /**
     * Basic palindrome check using logic for UC2 requirements.
     */
    public static boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equalsIgnoreCase(reversed);
    }
}
