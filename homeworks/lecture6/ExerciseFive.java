package homeworks.lecture6;

public class ExerciseFive {
    public static void main(String[] args) {
        int number1 = 121;
        boolean isPalindrome1 = isPalindrome(number1);
        System.out.println(number1 + " is palindrome: " + isPalindrome1);

        int number2 = 12345;
        boolean isPalindrome2 = isPalindrome(number2);
        System.out.println(number2 + " is palindrome: " + isPalindrome2);
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return originalNumber == reverse;
    }
}
