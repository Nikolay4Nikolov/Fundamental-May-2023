package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOfASCIITable05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {
            System.out.print((char) i + " ");
        }

    }
}
