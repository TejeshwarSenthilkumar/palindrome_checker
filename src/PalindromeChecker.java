public class PalindromeChecker {
    public static void main(String[] args) {
        displayWelcomeMessage();

        String input = "madam";
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    public static void displayWelcomeMessage() {
        System.out.println("Welcome to the Palindrome Checker App!");
    }
}
