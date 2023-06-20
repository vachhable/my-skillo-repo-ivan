package homeworks.lecture6;

public class ExerciseOne {
    public static void findSmallestNumber(int num1, int num2, int num3) {
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        System.out.println("The smallest number is: " + smallest);
    }

    public static void main(String[] args) {
        int number1 = 45;
        int number2 = 7;
        int number3 = 20;

        findSmallestNumber(number1, number2, number3);
    }
}
