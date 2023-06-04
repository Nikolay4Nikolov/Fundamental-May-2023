package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int order = Integer.parseInt(scanner.nextLine());
        double total = 0;

        for (int i = 1; i <= order ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int day = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double sumOfCoffee = 0;
            sumOfCoffee = day * capsulesCount * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f\n", sumOfCoffee);

            total += sumOfCoffee;
        }

        System.out.printf("Total: $%.2f", total);

    }
}
