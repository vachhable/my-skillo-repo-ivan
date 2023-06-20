package homeworks.lecture6;

public class ExerciseTwo {
        public static void main(String[] args) {
            double num1 = 5.4;
            double num2 = 10.3;
            double num3 = 15.5;

            double average = computeAverageNumber(num1, num2, num3);

            System.out.println("The average is: " + average);
        }

        public static double computeAverageNumber(double num1, double num2, double num3) {
            double sum = num1 + num2 + num3;
            double average = sum / 3;

            return average;
        }
}
