package homeworks;

import java.util.Scanner;

class firstExerciseLecture04 {

    public static void main(String[] args) {
        exerciseOneTriangle();
    }

    public static void exerciseOneTriangle() {
        System.out.println("Enter first triangle angle degrees");
        Scanner inputFirstAngle = new Scanner(System.in);
        int firstAngle = inputFirstAngle.nextInt();
        System.out.println("Enter second triangle angle degrees");
        Scanner inputSecondAngle = new Scanner(System.in);
        int secondAngle = inputSecondAngle.nextInt();
        System.out.println("Enter third triangle angle degrees");
        Scanner inputThirdAngle = new Scanner(System.in);
        int thirdAngle = inputThirdAngle.nextInt();
        int addAllAngles = firstAngle + secondAngle + thirdAngle;
        if (addAllAngles == 180) {
            System.out.println("The triangle is possible since the combination of all 3 angles is equal to 180 degrees");
            if (firstAngle == secondAngle && secondAngle == thirdAngle) {
                System.out.println("The triangle is equilateral");
            } else if (firstAngle != secondAngle && secondAngle != thirdAngle && thirdAngle != firstAngle) {
                System.out.println("The triangle is multifaceted");
            } else if ((firstAngle == secondAngle) | (secondAngle == thirdAngle) | (firstAngle == thirdAngle)) {
                System.out.println("The triangle is isosceles");
            } else if ((firstAngle > 90) | (secondAngle > 90) | (thirdAngle > 90)){
                System.out.println("The triangle is obtuse");
            } else if ((firstAngle == 90) | (secondAngle == 90) | (thirdAngle == 90)){
                System.out.println("The triangle is right-angled");
            } else if ((firstAngle < 90) && (secondAngle < 90) && (thirdAngle < 90)){
                System.out.println("The triangle is ocute");
            }
            } else {
            System.out.println("The triangle is not possible since the combination of all 3 angles is not equal to 180 degrees");
        }
    }
}
