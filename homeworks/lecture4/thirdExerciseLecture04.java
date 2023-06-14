package homeworks.lecture4;
import java.util.Scanner;
public class thirdExerciseLecture04 {
    public static void main(String[] args) {
        exerciseAreYouEligibleForWork();
    }
        public static void exerciseAreYouEligibleForWork(){
            System.out.println("Enter your age:");
            Scanner inputUserAge = new Scanner (System.in);
            int userAge = inputUserAge.nextInt();
            if (userAge >= 16) {
                System.out.println("You are eligible to work.");
            } else {
                System.out.println("You are not eligible to work");
            }
        }


}
