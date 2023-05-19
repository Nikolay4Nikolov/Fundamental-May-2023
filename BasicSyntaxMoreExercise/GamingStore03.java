package BasicSyntaxMoreExercise;

import java.util.Scanner;

public class GamingStore03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String nameGame = scanner.nextLine();
        double lastBudget = 0.00;
        boolean isFinish = true;
        double money = budget;


        while (!nameGame.equals("Game Time")) {

            lastBudget = budget;

            if (nameGame.equals("OutFall 4")) {
                budget = budget - 39.99;
                if (budget >= 0) {
                    System.out.println("Bought OutFall 4");
                }
            } else if (nameGame.equals("CS: OG")) {
                budget = budget - 15.99;
                if (budget >= 0) {
                    System.out.println("Bought CS: OG");
                }
            } else if (nameGame.equals("Zplinter Zell")) {
                budget = budget - 19.99;
                if (budget >= 0) {
                    System.out.println("Bought Zplinter Zell");
                }
            } else if (nameGame.equals("Honored 2")) {
                budget = budget - 59.99;
                if (budget >= 0) {
                    System.out.println("Bought Honored 2");
                }
            } else if (nameGame.equals("RoverWatch")) {
                budget = budget - 29.99;
                if (budget >= 0) {
                    System.out.println("Bought RoverWatch");
                }
            } else if (nameGame.equals("RoverWatch Origins Edition")) {
                budget = budget - 39.99;
                if (budget >= 0) {
                    System.out.println("Bought RoverWatch Origins Edition");
                }
            } else {
                System.out.println("Not Found");
            }

            if (budget == 0) {
                System.out.println("Out of money!");
                isFinish = false;
                break;
            }
            if (budget < 0) {
                System.out.println("Too Expensive");
                budget = lastBudget;
            }

            nameGame = scanner.nextLine();
        }
            if (isFinish) {
                double spendMoney = money - budget;
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spendMoney, budget);
            }


    }
}
