package homeworks.lecture4;
import java.util.Scanner;

public class secondExerciseLecture04 {
    public static void main(String[] args) {
        exerciseTwoDaysOfWeek();
    }
    public static void exerciseTwoDaysOfWeek(){
        System.out.println("Write a number between 1 & 7 to see what day of the week it is:");
        Scanner inputUserOneToSeven = new Scanner(System.in);
        int userInput = inputUserOneToSeven.nextInt();
        switch(userInput){
            case 1:
                System.out.println("The " + userInput + "st day of the week is Monday.");
                break;
            case 2:
                System.out.println("The " + userInput + "nd day of the week is Tuesday.");
                break;
            case 3:
                System.out.println("The " + userInput + "rd day of the week is Wednesday.");
                break;
            case 4:
                System.out.println("The " + userInput + "th day of the week is Thursday.");
                break;
            case 5:
                System.out.println("The " + userInput + "th day of the week is Friday.");
                break;
            case 6:
                System.out.println("The " + userInput + "th day of the week is Saturday.");
                break;
            case 7:
                System.out.println("The " + userInput + "th day of the week is Sunday.");
                break;
            default:
                System.out.println("You didn't put a valid number between 1 and 7.");
        }
    }

}
