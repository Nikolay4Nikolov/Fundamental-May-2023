package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            if (input.equals(isPalindrome(input))) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }

            input = scanner.nextLine();
        }

    }
    public static String isPalindrome (String number) {
        String reversText = "";
        for (int index = number.length() - 1; index >= 0 ; index--) {
            reversText = reversText + number.charAt(index);
        }
        return reversText;
    }
}
