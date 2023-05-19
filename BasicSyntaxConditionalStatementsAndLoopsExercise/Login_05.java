package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0 ; i--) {
            char currentSymbol = username.charAt(i);
            password += currentSymbol;
        }

        String inputPassword = scanner.nextLine();
        int counter = 0;
        while (!password.equals(inputPassword)) {
            counter++;
            if (counter == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            inputPassword = scanner.nextLine();
        }

        if (password.equals(inputPassword)) {
            System.out.printf("User %s logged in.", username);
        }


    }
}
