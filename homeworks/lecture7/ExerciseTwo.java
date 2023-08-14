package homeworks.lecture7;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExerciseTwo {

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

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Enter the file path: ");
                String filePath = scanner.nextLine();

                System.out.print("Enter the number of times to print the text to the file: ");
                int howManyTimesToPrintTheTextToFile = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter the text to add to the file: ");
                String textToAdd = scanner.nextLine();

                FileWriter fileWriter = null;
                try {
                    fileWriter = getFileWriter(filePath);
                    printToFile(fileWriter, textToAdd, howManyTimesToPrintTheTextToFile);
                    System.out.println("Text written to the file successfully.");
                } catch (IOException e) {
                    System.out.println("An error occurred while writing to the file: " + e.getMessage());
                }
                } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter valid numbers.");
                } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                } finally {
                scanner.close();
            }
        }
}
