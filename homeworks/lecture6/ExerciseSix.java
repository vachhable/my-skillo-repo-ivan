package homeworks.lecture6;

public class ExerciseSix {
    public static void main(String[] args) {
        int num1 = 121;
        boolean isPalindrome1 = isPalindrome(num1);
        System.out.println(num1 + " is palindrome: " + isPalindrome1);

        int num2 = 12345;
        boolean isPalindrome2 = isPalindrome(num2);
        System.out.println(num2 + " is palindrome: " + isPalindrome2);
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }

        String numberStr = String.valueOf(num);
        String reversedStr = new StringBuilder(numberStr).reverse().toString();

        return numberStr.equals(reversedStr);
    }
}
