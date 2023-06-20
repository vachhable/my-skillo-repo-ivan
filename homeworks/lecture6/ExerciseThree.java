package homeworks.lecture6;

public class ExerciseThree {
    public static void displayMiddleCharacter(String word) {
        int length = word.length();
        int middleIndex = length / 2;

        if (length % 2 == 0) {
            char middleChar1 = word.charAt(middleIndex - 1);
            char middleChar2 = word.charAt(middleIndex);
            System.out.println("Middle characters: " + middleChar1 + middleChar2);
        } else {
            char middleChar = word.charAt(middleIndex);
            System.out.println("Middle character: " + middleChar);
        }
    }

    public static void main(String[] args) {
        String word1 = "Hello";
        displayMiddleCharacter(word1);

        String word2 = "Worlds";
        displayMiddleCharacter(word2);
    }
}
