package homeworks.lecture5;

public class ExerciseSevenLecture05 {
    public static boolean isPalindrome(String input) {
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanedInput.length() - 1;

        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama";

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
