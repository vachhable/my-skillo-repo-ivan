package homeworks.lecture6;

public class ExerciseThree {
    public static void main(String[] args) {
        String str = "Testing out some of things";

        // Displaying the middle character(s) of the string
        displayMiddleCharacter(str);

        // Counting the number of words in the string
        int wordCount = countWords(str);
        System.out.println("Number of words: " + wordCount);
    }

    // Method to display the middle character(s) of a string
    public static void displayMiddleCharacter(String str) {
        int length = str.length();
        int middle = length / 2;

        if (length % 2 == 0) {
            System.out.println("Middle characters: " + str.charAt(middle - 1) + str.charAt(middle));
        } else {
            System.out.println("Middle character: " + str.charAt(middle));
        }
    }

    // Method to count all words in a string
    public static int countWords(String str) {
        String[] words = str.split("\\s+");

        return words.length;
    }
}
