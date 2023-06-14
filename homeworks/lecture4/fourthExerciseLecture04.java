package homeworks.lecture4;
import java.util.Scanner;
public class fourthExerciseLecture04 {
    public static void main(String[] args) {
        fourthExerciseCalculateRevenue();
    }
    public static void fourthExerciseCalculateRevenue() {
        System.out.println("Enter unit price:");
        Scanner userInputUnitPrice = new Scanner (System.in);
        int unitPrice = userInputUnitPrice.nextInt();
        System.out.println("Enter quantity");
        Scanner userInputQuantity = new Scanner (System.in);
        int unitQuantity = userInputQuantity.nextInt();
        int revenueBeforeDiscounts = unitPrice * unitQuantity;
        double discount15Percent = revenueBeforeDiscounts * 0.15;
        double revenueWith15Discount = revenueBeforeDiscounts - discount15Percent;
        double discount20Percent = revenueBeforeDiscounts * 0.20;
        double revenueWith20Discount = revenueBeforeDiscounts - discount20Percent;
        if (unitQuantity >= 100 && unitQuantity <= 120){
            System.out.println("The revenue from sale: " + revenueWith15Discount + "$");
            System.out.println("The discount is:" + discount15Percent + "$(15%)");
        } else if (unitQuantity > 120){
            System.out.println("The revenue from sale: " + revenueWith20Discount + "$");
            System.out.println("The discount is:" + discount20Percent + "$(20%)");
        }
        else {
            System.out.println("The revenue from sale: " + revenueBeforeDiscounts + "$");
            System.out.println("The discount is 0%");

        }
    }
}
