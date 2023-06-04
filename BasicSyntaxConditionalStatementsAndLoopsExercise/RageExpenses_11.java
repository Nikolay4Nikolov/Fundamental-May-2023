package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double priceHeadSet = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());

        int countTrashedHeadSet = lostGames / 2;
        int countTrashedMouse = lostGames / 3;
        int countTrashedKeyboard = lostGames / 6;
        int countTrashedDisplay = lostGames / 12;

        double total = priceHeadSet * countTrashedHeadSet +
                priceMouse * countTrashedMouse+
                priceKeyboard * countTrashedKeyboard +
                priceDisplay * countTrashedDisplay;

        System.out.printf("Rage expenses: %.2f lv.", total);


    }
}
