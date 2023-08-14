package homeworks.lecture7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExerciseThree {
    private static FileWriter getFileWriter(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath, true);
        return fileWriter;
    }

    protected static void closeFileWriter(FileWriter fileWriter) throws IOException {
        fileWriter.close();
    }

    public static void printToFile(FileWriter fileWriter, String text, int repeat) throws IOException {
        for (int i = 0; i < repeat; i++) {
            fileWriter.write(text + "\n");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        System.out.print("Enter the number of times to print the text to the file: ");
        int howManyTimesToPrintTheTextToFile = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the text to add to the file: ");
        String textToAdd = scanner.nextLine();

        FileWriter fileWriter = getFileWriter(filePath);
        printToFile(fileWriter, textToAdd, howManyTimesToPrintTheTextToFile);
        System.out.println("Text written to the file successfully.");

        closeFileWriter(fileWriter);
        scanner.close();
    }
}
