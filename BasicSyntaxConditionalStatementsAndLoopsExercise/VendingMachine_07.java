package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double coin = 0;
        double sumCoin = 0;

        while (!input.equals("Start")) {
            coin = Double.parseDouble(input);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1.0 || coin == 2.0) {
                sumCoin = sumCoin + coin;
            } else {
                System.out.printf("\nCannot accept %.2f\n", coin);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        double lastCoin = 0;

        while (!input.equals("End")) {
            lastCoin = sumCoin;

            if (input.equals("Nuts")) {
                sumCoin = sumCoin - 2.0;
                if (sumCoin < 0 ) {
                    System.out.println("Sorry, not enough money");
                    sumCoin = lastCoin;
                } else {
                    System.out.println("Purchased Nuts");
                }
            } else if (input.equals("Water")) {
                sumCoin = sumCoin - 0.7;
                if (sumCoin < 0 ) {
                    System.out.println("Sorry, not enough money");
                    sumCoin = lastCoin;
                } else {
                    System.out.println("Purchased Water");
                }
            } else if (input.equals("Crisps")) {
                sumCoin = sumCoin - 1.5;
                if (sumCoin < 0 ) {
                    System.out.println("Sorry, not enough money");
                    sumCoin = lastCoin;
                } else {
                    System.out.println("Purchased Crisps");
                }
            } else if (input.equals("Soda")) {
                sumCoin = sumCoin - 0.8;
                if (sumCoin < 0 ) {
                    System.out.println("Sorry, not enough money");
                    sumCoin = lastCoin;
                } else {
                    System.out.println("Purchased Soda");
                }
            } else if (input.equals("Coke")) {
                sumCoin = sumCoin - 1.0;
                if (sumCoin < 0 ) {
                    System.out.println("Sorry, not enough money");
                    sumCoin = lastCoin;
                } else {
                    System.out.println("Purchased Coke");
                }
            } else {
                System.out.println("Invalid product");
            }


            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f\n", sumCoin);

    }
}
