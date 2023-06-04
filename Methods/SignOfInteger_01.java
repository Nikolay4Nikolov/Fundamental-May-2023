package Methods;

import java.util.Scanner;

public class SignOfInteger_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printNumber (number);

    }
    public static void printNumber(int num) {
        String text = "";
        if (num < 0) {
            text = "negative;";
        } else if (num > 0) {
            text = "positive";
        } else {
            text = "zero";
        }
        System.out.printf("The number %d is %s.", num, text);
    }
}
