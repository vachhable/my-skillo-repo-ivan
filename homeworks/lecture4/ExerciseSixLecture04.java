package homeworks.lecture4;
import java.util.Scanner;
public class ExerciseSixLecture04 {
    public static void main(String[] args) {
        exerciseWhereShouldYouVacate();
    }

    public static void exerciseWhereShouldYouVacate() {
        System.out.println("Do you want to vacate on the Beach or the Mountain? Please specify.");
        Scanner userInputType = new Scanner(System.in);
        String userInput = userInputType.nextLine();
        System.out.println("What is your budget per day per person?");
        Scanner userInputBudget = new Scanner(System.in);
        int userBudgetPerPerson = userInputBudget.nextInt();
        if (userInput.equals("Beach")) {
            if (userBudgetPerPerson < 50) {
                System.out.println("Bulgaria should be your destination.");
            } else {
                System.out.println("A country outside of Bulgaria should be your destination.");
            }
        } else if (userInput.equals("Mountain")) {
            if (userBudgetPerPerson < 30) {
                System.out.println("Bulgaria should be your destination.");
            } else {
                System.out.println("A country outside of Bulgaria should be your destination.");
            }
        } else {
            System.out.println("There's no information about this type of vacation.");

        }
    }
}