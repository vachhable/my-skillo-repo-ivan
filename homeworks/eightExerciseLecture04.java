package homeworks;

public class eightExerciseLecture04 {
    public static void main(String[] args) {
        exerciseReverseList();
    }
    public static void exerciseReverseList(){
        int list[] = {10, 20, 30, 40, 50};
        for (int i = list.length - 1; i >= 0; i--) {
                System.out.print(list[i] + " ");
            }
        }
    }
