package DataTypesAndVariablesLab;

import java.util.Scanner;

public class SpecialNumbers10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number ; i++) {

            int sum = 0;
            int currentNum = i;

            while (currentNum > 0) {
                sum = sum + currentNum % 10;
                currentNum = currentNum / 10;
            }

            boolean isSpecial = sum == 5 || sum == 7 || sum == 11;

            if (isSpecial) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }

        }

    }
}
