package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYields = Integer.parseInt(scanner.nextLine());
        int countDays = 0;
        int totalSpice = 0;
        boolean isValid = startingYields >= 100;

        while (startingYields >= 100) {
            countDays++;
            totalSpice += startingYields - 26;
            startingYields -= 10;
        }
        if (isValid) {
        totalSpice = totalSpice - 26;
        System.out.println(countDays);
        System.out.println(totalSpice);
    } else {
            System.out.println(0);
            System.out.println(0);
        }

    }
}
