package homeworks.lecture6;

public class ExerciseTwo {
    public static void computeAverage(double num1, double num2, double num3) {
        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("The average is: " + average);
    }

    public static void main(String[] args) {
        double number1 = 13.5;
        double number2 = 6.2;
        double number3 = 3.7;

        computeAverage(number1, number2, number3);
    }
}
