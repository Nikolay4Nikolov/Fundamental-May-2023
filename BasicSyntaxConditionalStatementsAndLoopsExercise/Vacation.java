package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        String typePersons = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.00;

        if (day.equals("Friday")) {
            if (typePersons.equals("Students")) {
                price = 8.45;
            } else if (typePersons.equals("Business")) {
                price = 10.90;
            } else if (typePersons.equals("Regular")) {
                price = 15.00;
            }
        } else if (day.equals("Saturday")) {
            if (typePersons.equals("Students")) {
                price = 9.80;
            } else if (typePersons.equals("Business")) {
                price = 15.60;
            } else if (typePersons.equals("Regular")) {
                price = 20.00;
            }
        } else if (day.equals("Sunday")) {
            if (typePersons.equals("Students")) {
                price = 10.46;
            } else if (typePersons.equals("Business")) {
                price = 16.00;
            } else if (typePersons.equals("Regular")) {
                price = 22.50;
            }
        }

        double totalSum = price * persons;


        if (typePersons.equals("Students") && persons >= 30) {
            totalSum = totalSum - totalSum * 0.15;
        }
        if (typePersons.equals("Business") && persons >= 100) {
            totalSum = totalSum - price * 10;
        }
        if (typePersons.equals("Regular") && persons >= 10 && persons <= 20) {
            totalSum = totalSum - totalSum * 0.05;
        }

        System.out.printf("Total price: %.2f", totalSum);

    }
}
