package Methods;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputDrink = scanner.nextLine();
        double inputQuantity = Double.parseDouble(scanner.nextLine());

        result(inputDrink, inputQuantity);
    }

    public static void result(String drink, double quantity) {
        double price = 0;
        if (drink.equals("coffee")) {
            price = 1.50;
        } else if (drink.equals("water")) {
            price = 1.00;
        } else if (drink.equals("coke")) {
            price = 1.40;
        } else if (drink.equals("snacks")) {
            price = 2.00;
        }
        double result = price * quantity;
        System.out.printf("%.2f", result);
    }
}
