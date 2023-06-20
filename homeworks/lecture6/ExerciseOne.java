package homeworks.lecture6;

public class ExerciseOne {
        public static void main(String[] args) {
            double x = 3;
            double y = 2.5;
            double z = 2.4;

            System.out.println("The smallest number is: " + findSmallestNumber(x, y, z));
        }

        public static double findSmallestNumber(double num1, double num2, double num3) {
            double smallestNumber = num1;

            if (num2 < smallestNumber) {
                smallestNumber = num2;
            }

            if (num3 < smallestNumber) {
                smallestNumber = num3;
            }

            return smallestNumber;
        }
    }
