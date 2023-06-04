package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class TriangleOfNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number ; i++) {
            int row = i;
            for (int j = 1; j <= row ; j++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

    }
}
