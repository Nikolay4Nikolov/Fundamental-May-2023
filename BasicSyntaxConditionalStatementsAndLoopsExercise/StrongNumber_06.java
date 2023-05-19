package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sumFact = 0;
        int firstNumber = number;

        while (number > 0) {
            int lastNumber = number % 10;
            int fact = 1;
            for (int i = 1; i <= lastNumber ; i++) {
                fact = fact * i;
            }
            sumFact += fact;
            number = number / 10;
        }

        if (firstNumber == sumFact) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
