package homeworks.lecture6;

public class ExerciseFour {

    public static void main(String[] args) {
    int number = 9;
    boolean isNumberEven = isEven(number);

    if (isNumberEven) {
        System.out.println(number + " is even.");
    } else {
        System.out.println(number + " is odd.");
    }
}

    public static boolean isEven(int number) {
        boolean isEven = false;

        if (number % 2 == 0) {
            isEven = true;
        }

        return isEven;
    }
}
