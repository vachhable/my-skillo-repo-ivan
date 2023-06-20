package homeworks.lecture6;

public class ExerciseFour {
    public static void countWords(String str) {
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                inWord = false;
            } else if (!inWord) {
                inWord = true;
                wordCount++;
            }
        }

        System.out.println("Number of words: " + wordCount);
    }

    public static void main(String[] args) {
        String sentence = "How was your weekend?";
        countWords(sentence);
    }
}
