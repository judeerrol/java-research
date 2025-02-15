public class PalindromeCheck {
    public static void main(String[] args) {
        String word = "racecar";
        System.out.println(word + " is palindrome? " + isPalindrome(word));
    }

    static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
