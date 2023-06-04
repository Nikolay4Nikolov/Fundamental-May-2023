package MethodsExercise;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstInput = scanner.nextLine().charAt(0);
        char secondInput = scanner.nextLine().charAt(0);

        printCharacters(firstInput, secondInput);

    }
    public static void printCharacters (char input1, char input2) {
        if (input1 < input2) {
            for (char index = (char) (input1 + 1); index < input2; index++) {
                System.out.print(index + " ");
            }
        } else {
            for (char index = (char) (input2 + 1); index < input1; index++) {
                System.out.print(index + " ");
            }
        }
    }
}
