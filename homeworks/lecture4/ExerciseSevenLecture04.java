package homeworks.lecture4;

public class ExerciseSevenLecture04 {
    public static void main(String[] args) {
        exerciseDisplayNumbersDivisibleByFive();
    }

    public static void exerciseDisplayNumbersDivisibleByFive() {
        int list1[] = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] % 5 == 0 && list1[i] <= 150){
                System.out.println(list1[i]);
            }
            }
            }
            }