package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SumOfChars04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            char symbol = scanner.nextLine().charAt(0);
            int asciiNum = (int) symbol;
            sum = sum + asciiNum;
        }
        System.out.println("The sum equals: " + sum);
    }
}
