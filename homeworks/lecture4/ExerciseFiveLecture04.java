package homeworks.lecture4;

public class ExerciseFiveLecture04 {
    public static void main(String[] args) {
        fifthExerciseFindLargestNumberFromArray();
    }
    public static void fifthExerciseFindLargestNumberFromArray(){
        int[] arr ={2,11,45,9};
        int highest = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > highest)
                highest = arr[i];
        }
        System.out.println("Largest number from the array is: " + highest);

    }
}
