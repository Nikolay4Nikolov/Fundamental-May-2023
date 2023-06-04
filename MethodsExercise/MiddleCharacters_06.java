package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        middleCharacters(input);

    }
    public static void middleCharacters (String text) {
        int digit = text.length() / 2;
        if (text.length() % 2 == 0) {
            System.out.println(text.charAt(digit - 1) + "" + text.charAt(digit));
        } else {
            System.out.println(text.charAt(digit));
        }
    }
}
