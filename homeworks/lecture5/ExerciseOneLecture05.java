package homeworks.lecture5;

public class ExerciseOneLecture05 {
    public static void main(String[] args) {
        calculateSumOfArrayElements();
    }

    public static void calculateSumOfArrayElements(){
        int[] evenNumbers = {2, 4, 6, 8, 10};
        int sumOfEvenNumbers = 0;
        for (int i = 0; i < evenNumbers.length; i++){
            sumOfEvenNumbers = sumOfEvenNumbers + evenNumbers[i];
        }
        System.out.println("Sum of the items is = " + sumOfEvenNumbers);
    }
}
