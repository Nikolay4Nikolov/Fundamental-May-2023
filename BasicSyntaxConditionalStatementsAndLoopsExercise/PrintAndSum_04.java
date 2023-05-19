package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int lastNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = startNum; i <= lastNum; i++) {
            System.out.print(i + " ");
            sum = sum + i;
        }

        System.out.println("\nSum: " + sum);

    }
}
