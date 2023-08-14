package homeworks.lecture5;

public class ExerciseSixLecture05 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Sum of the diagonal elements: " + sum);
    }
}
