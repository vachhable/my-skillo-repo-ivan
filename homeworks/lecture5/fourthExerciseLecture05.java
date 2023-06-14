package homeworks.lecture5;

public class fourthExerciseLecture05 {

    public static void main(String[] args) {
        findBiggestElementOfAnArray();
    }

    public static void findBiggestElementOfAnArray(){
        int[] arr ={2,11,45,9,100,30,24,39,60};
        int highest = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > highest)
                highest = arr[i];
        }
        System.out.println("Largest number from the array is: " + highest);

    }

    }
