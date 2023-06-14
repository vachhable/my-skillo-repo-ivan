package homeworks.lecture5;

import java.sql.SQLOutput;
import java.util.Scanner;
public class thirdExerciseLecture05 {
    public static void main(String[] args) {
        printElementsOfGiven2DMatrixWithDynamicRowsAndColumns();
    }
    public static void printElementsOfGiven2DMatrixWithDynamicRowsAndColumns(){
        int inputUserRow, inputUserColumn;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of how many rows should the matrix consist of:");
        inputUserRow = scanner.nextInt();
        System.out.println("Enter value of how many columns should the matrix consist of:");
        inputUserColumn = scanner.nextInt();

        int[][] dynamicArr = new int[inputUserRow][inputUserColumn];

        int startingValue = 1;

        for (int i = 0; i < inputUserRow; i++) {
            for (int j = 0; j < inputUserColumn; j++) {
                dynamicArr[i][j] = startingValue;
                System.out.println("The array is: " + dynamicArr[i][j]);
                startingValue++;
            }
        }

    }
}